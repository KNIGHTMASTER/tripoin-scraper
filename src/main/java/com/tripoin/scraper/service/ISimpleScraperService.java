package com.tripoin.scraper.service;

import com.tripoin.scraper.dto.FormInputElementDTO;
import com.tripoin.scraper.dto.ImageElementDTO;
import com.tripoin.scraper.dto.LinkElementDTO;
import com.tripoin.scraper.dto.MetaElementDTO;

import java.util.List;

/**
 * Created on 11/7/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ISimpleScraperService {

    String getPageTitle();

    List<LinkElementDTO> getLinkElements();

    List<ImageElementDTO> getImageElements();

    List<MetaElementDTO> getMetaElements();

    List<FormInputElementDTO> getFormInputElements();
}
