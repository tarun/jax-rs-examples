package com.tarunbk.example.jax_rs_examples.jersey2_xml_client_example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "self_governing", namespace = "http://purl.org/dc/elements/1.1")
@XmlAccessorType(XmlAccessType.FIELD)
public class Country {

    @XmlID
    private String id;

    @XmlElement(name = "codeISO3")
    private String iso3Code;

    @XmlElement(name = "codeISO2")
    private String iso2Code;

    @XmlElement(name = "nameOfficialEN")
    private String officialName;

    @XmlElement(name = "nameShortEN")
    private String shortName;

    @XmlElement(name = "nameListEN")
    private String listName;

    @XmlElement(name = "FAO_MEMBERS")
    private String faoMembers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIso3Code() {
        return iso3Code;
    }

    public void setIso3Code(String iso3Code) {
        this.iso3Code = iso3Code;
    }

    public String getIso2Code() {
        return iso2Code;
    }

    public void setIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getFaoMembers() {
        return faoMembers;
    }

    public void setFaoMembers(String faoMembers) {
        this.faoMembers = faoMembers;
    }

    @Override
    public String toString() {
        return "Country [id=" + id + ", iso3Code=" + iso3Code + ", iso2Code=" + iso2Code + ", officialName=" + officialName + ", shortName=" + shortName
                + ", listName=" + listName + ", faoMembers=" + faoMembers + "]";
    }

}
