package com.tripoin.scraper.dto;

import java.io.Serializable;

/**
 * Created on 11/7/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class MetaElementDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = 4251796871692342878L;

    private String name;
    private String content;
    private String httpHeader;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHttpHeader() {
        return httpHeader;
    }

    public void setHttpHeader(String httpHeader) {
        this.httpHeader = httpHeader;
    }

    @Override
    public String toString() {
        return "MetaElementDTO{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", httpHeader='" + httpHeader + '\'' +
                '}';
    }
}
