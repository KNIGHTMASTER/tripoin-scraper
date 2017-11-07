package com.tripoin.scraper.service;

import com.tripoin.scraper.ITripoinScraperConstant.HTMLElement;
import com.tripoin.scraper.ITripoinScraperConstant.HyperLinkAttribute;
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
                linkElementDTO.setUrl(element.attr(HyperLinkAttribute.URL));
                linkElementDTO.setFileName(element.attr(HyperLinkAttribute.FILENAME));
                linkElementDTO.setLanguageCode(element.attr(HyperLinkAttribute.LANGUAGE_CODE));
                linkElementDTO.setMediaQuery(element.attr(HyperLinkAttribute.MEDIA_QUERY));
                linkElementDTO.setRelationship(element.attr(HyperLinkAttribute.RELATIONSHIP));
                linkElementDTO.setTarget(element.attr(HyperLinkAttribute.TARGET));
                linkElementDTO.setType(element.attr(HyperLinkAttribute.MEDIA_TYPE));
                linkElementDTOs.add(linkElementDTO);
            }
            return linkElementDTOs;
        }else {
            return null;
        }
    }

    @Override
    public List<ImageElementDTO> getImageElements() {
        return null;
    }

    @Override
    public List<MetaElementDTO> getMetaElements() {
        return null;
    }

    @Override
    public List<FormInputElementDTO> getFormInputElements() {
        return null;
    }
}
