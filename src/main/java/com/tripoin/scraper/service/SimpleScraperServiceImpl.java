package com.tripoin.scraper.service;

import com.tripoin.scraper.ITripoinScraperConstant.Attribute.HyperLink;
import com.tripoin.scraper.ITripoinScraperConstant.Attribute.Image;
import com.tripoin.scraper.ITripoinScraperConstant.Attribute.Meta;
import com.tripoin.scraper.ITripoinScraperConstant.HTMLElement;
import com.tripoin.scraper.dto.FormInputElementDTO;
import com.tripoin.scraper.dto.ImageElementDTO;
import com.tripoin.scraper.dto.LinkElementDTO;
import com.tripoin.scraper.dto.MetaElementDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 11/7/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class SimpleScraperServiceImpl implements ISimpleScraperService, IComponentInitializer {

    private Document document;

    @Value("${app.scrap.target.url}")
    private String urlToScrap;

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleScraperServiceImpl.class);

    @PostConstruct
    @Override
    public void initComponents() {
        try {
            document = Jsoup.connect(urlToScrap).get();
        } catch (IOException e) {
            LOGGER.error("Error connection to Url Target ".concat(e.toString()));
        }
    }

    @Override
    public String getPageTitle() {
        return document.title();
    }

    @Override
    public List<LinkElementDTO> getLinkElements() {
        Elements links = document.select(HTMLElement.HYPERLINK);
        List<LinkElementDTO> linkElementDTOs = new ArrayList<>();
        if (links.size() > 0) {
            for(Element element : links) {
                LinkElementDTO linkElementDTO = new LinkElementDTO();
                linkElementDTO.setText(element.text());
                linkElementDTO.setUrl(element.attr(HyperLink.URL));
                linkElementDTO.setFileName(element.attr(HyperLink.FILENAME));
                linkElementDTO.setLanguageCode(element.attr(HyperLink.LANGUAGE_CODE));
                linkElementDTO.setMediaQuery(element.attr(HyperLink.MEDIA_QUERY));
                linkElementDTO.setRelationship(element.attr(HyperLink.RELATIONSHIP));
                linkElementDTO.setTarget(element.attr(HyperLink.TARGET));
                linkElementDTO.setType(element.attr(HyperLink.MEDIA_TYPE));

                linkElementDTOs.add(linkElementDTO);
            }
        }
        return linkElementDTOs;
    }

    @Override
    public List<ImageElementDTO> getImageElements() {
        Elements images = document.select(HTMLElement.IMAGE);
        List<ImageElementDTO> imageElementDTOs = new ArrayList<>();
        if (images.size() > 0){
            for (Element element : images) {
                ImageElementDTO imageElementDTO = new ImageElementDTO();
                imageElementDTO.setSource(element.attr(Image.SOURCE));
                imageElementDTO.setHeight(element.attr(Image.HEIGHT));
                imageElementDTO.setWidth(element.attr(Image.WIDTH));
                imageElementDTO.setAlt(element.attr(Image.ALTERNATE));
                imageElementDTO.setCrossOrigin(element.attr(Image.CROSSORIGIN));
                imageElementDTO.setImageMap(element.attr(Image.IMAGE_MAP));
                imageElementDTO.setUrlDetailDescription(element.attr(Image.URL_DETAIL_DESCRIPTION));
                imageElementDTO.setSizes(element.attr(Image.SIZES));
                imageElementDTO.setSourceSet(element.attr(Image.SOURCE_SET));
                imageElementDTO.setUseMap(element.attr(Image.USEMAP));

                imageElementDTOs.add(imageElementDTO);
            }
        }
        return imageElementDTOs;
    }

    @Override
    public List<MetaElementDTO> getMetaElements() {
        Elements metaElements = document.select(HTMLElement.META);
        List<MetaElementDTO> metaElementDTOs = new ArrayList<>();
        if (metaElements.size() > 0){
            for (Element element : metaElements) {
                MetaElementDTO metaElementDTO = new MetaElementDTO();
                metaElementDTO.setName(element.attr(Meta.NAME));
                metaElementDTO.setContent(element.attr(Meta.CONTENT));
                metaElementDTO.setHttpHeader(element.attr(Meta.HTTP_HEADER));

                metaElementDTOs.add(metaElementDTO);
            }
        }
        return metaElementDTOs;
    }

    @Override
    public List<FormInputElementDTO> getFormInputElements() {
        return null;
    }
}
