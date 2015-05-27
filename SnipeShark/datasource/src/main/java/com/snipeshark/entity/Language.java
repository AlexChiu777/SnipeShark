package com.snipeshark.entity;

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
    private int languageId;

    @Column(name="ISO_CODE")
    private String isoCode;

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
}
