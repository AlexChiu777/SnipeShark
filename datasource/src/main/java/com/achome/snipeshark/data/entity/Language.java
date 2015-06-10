package com.achome.snipeshark.data.entity;

import javax.persistence.*;

/**
 * Created by Alex on 5/24/2015.
 */
@Entity
@Access(AccessType.FIELD)
@Table(name="LANGUAGE")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="LANGUAGE_ID")
    private long languageId;

    @Column(name="ISO_CODE")
    private String isoCode;

    @Column(name="DESCRIPTION")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(long languageId) {
        this.languageId = languageId;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
}
