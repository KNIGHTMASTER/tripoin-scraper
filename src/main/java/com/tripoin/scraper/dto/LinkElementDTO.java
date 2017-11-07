package com.tripoin.scraper.dto;

import java.io.Serializable;

/**
 * Created on 11/7/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class LinkElementDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 7631545714538240603L;

    private String url;
    private String text;
    private String fileName;
    private String languageCode;
    private String mediaQuery;
    private String relationship;
    private String target;
    private String type;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getMediaQuery() {
        return mediaQuery;
    }

    public void setMediaQuery(String mediaQuery) {
        this.mediaQuery = mediaQuery;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "LinkElementDTO{" +
                "url='" + url + '\'' +
                ", text='" + text + '\'' +
                ", fileName='" + fileName + '\'' +
                ", languageCode='" + languageCode + '\'' +
                ", mediaQuery='" + mediaQuery + '\'' +
                ", relationship='" + relationship + '\'' +
                ", target='" + target + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
