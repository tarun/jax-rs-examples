package com.tarunbk.example.jax_rs_examples.jersey2_xml_client_example.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Data")
@XmlAccessorType(XmlAccessType.FIELD)
// @XmlSeeAlso(value = { Country.class, Header.class })
public class Countries {

    @XmlElement(name = "Header")
    private Header header;

    private List<Country> countries = new ArrayList<Country>();

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Countries [header=" + header + ", \n countries=" + countries + "]";
    }

}
