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

    private String description;
    private String keyWord;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }
}
