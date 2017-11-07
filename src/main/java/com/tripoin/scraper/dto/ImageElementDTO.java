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
    private String crossOrigin;
    private String imageMap;
    private String urlDetailDescription;
    private String sizes;
    private String sourceSet;
    private String useMap;

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

    public String getCrossOrigin() {
        return crossOrigin;
    }

    public void setCrossOrigin(String crossOrigin) {
        this.crossOrigin = crossOrigin;
    }

    public String getImageMap() {
        return imageMap;
    }

    public void setImageMap(String imageMap) {
        this.imageMap = imageMap;
    }

    public String getUrlDetailDescription() {
        return urlDetailDescription;
    }

    public void setUrlDetailDescription(String urlDetailDescription) {
        this.urlDetailDescription = urlDetailDescription;
    }

    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getSourceSet() {
        return sourceSet;
    }

    public void setSourceSet(String sourceSet) {
        this.sourceSet = sourceSet;
    }

    public String getUseMap() {
        return useMap;
    }

    public void setUseMap(String useMap) {
        this.useMap = useMap;
    }

    @Override
    public String toString() {
        return "ImageElementDTO{" +
                "source='" + source + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", alt='" + alt + '\'' +
                ", crossOrigin='" + crossOrigin + '\'' +
                ", imageMap='" + imageMap + '\'' +
                ", urlDetailDescription='" + urlDetailDescription + '\'' +
                ", sizes='" + sizes + '\'' +
                ", sourceSet='" + sourceSet + '\'' +
                ", useMap='" + useMap + '\'' +
                '}';
    }
}
