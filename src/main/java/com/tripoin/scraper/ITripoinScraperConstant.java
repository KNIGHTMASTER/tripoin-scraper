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
        String IMAGE = "img";
        String META = "meta";
    }

    interface Attribute {
        /**
         * <a href=https://www.w3schools.com/tags/tag_a.asp>W3 School A Tag Attribute</a>
         */
        interface HyperLink {
            String URL = "href";
            String FILENAME = "download";
            String LANGUAGE_CODE = "hreflang";
            String MEDIA_QUERY = "media";
            String RELATIONSHIP = "rel";
            String TARGET = "target";
            String MEDIA_TYPE = "type";
        }

        /**
         * <a href=https://www.w3schools.com/tags/tag_img.asp>W3 School Image Attribute</a>
         */
        interface Image {
            String ALTERNATE = "alt";
            String CROSSORIGIN = "crossorigin";
            String HEIGHT = "height";
            String IMAGE_MAP = "ismap";
            String URL_DETAIL_DESCRIPTION = "longdesc";
            String SIZES = "sizes";
            String SOURCE = "src";
            String SOURCE_SET = "srcset";
            String USEMAP = "usemap";
            String WIDTH = "width";
        }

        /**
         * <a href=https://www.w3schools.com/tags/tag_meta.asp>W3 School Meta Attribute</a>
         */
        interface Meta {
            String CONTENT = "content";
            String HTTP_HEADER = "http-equiv";
            String NAME = "name";
        }
    }



}
