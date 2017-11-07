package com.tripoin.scraper.dto;

import java.io.Serializable;

/**
 * Created on 11/7/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class ImageElementDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 3797468617373465265L;

    private String source;
    private String height;
    private String width;
    private String alt;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
