package com.tarunbk.example.jax_rs_examples.jersey2_xml_client_example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {

    @XmlElement(name = "ID")
    private String id;

    @XmlElement
    private String source;

    @XmlElement(name = "SourceIdentifier")
    private String sourceIdentifier;

    @XmlElement(name = "SourceModified")
    private String sourceModified;

    @XmlElement
    private String extractedDate;

    @XmlElement
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getSourceModified() {
        return sourceModified;
    }

    public void setSourceModified(String sourceModified) {
        this.sourceModified = sourceModified;
    }

    public String getExtractedDate() {
        return extractedDate;
    }

    public void setExtractedDate(String extractedDate) {
        this.extractedDate = extractedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Header [id=" + id + ", source=" + source + ", sourceIdentifier=" + sourceIdentifier + ", sourceModified=" + sourceModified + ", extractedDate="
                + extractedDate + ", description=" + description + "]";
    }

}
