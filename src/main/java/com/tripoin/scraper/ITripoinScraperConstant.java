package com.tripoin.scraper;

/**
 * Created on 11/7/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ITripoinScraperConstant {

    interface HTMLElement {
        String COMMENT = "!--...--";
        String DOCUMENT_TYPE = "!DOCTYPE";
        String HYPERLINK = "a";
        String ABBREVIATION = "abbr";
        String ACRONYM = "acronym";
        String ADDRESS = "address";
        String APPLET = "applet";
        String AREA = "area";
    }

    interface HyperLinkAttribute {
        String URL = "href";
        String FILENAME = "download";
        String LANGUAGE_CODE = "hreflang";
        String MEDIA_QUERY = "media";
        String RELATIONSHIP = "rel";
        String TARGET = "target";
        String MEDIA_TYPE = "type";
    }
}
