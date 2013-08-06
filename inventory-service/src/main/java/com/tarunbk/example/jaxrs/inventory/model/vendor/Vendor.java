package com.tarunbk.example.jaxrs.inventory.model.vendor;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Vendor {

    private String id;
    private String name;

    public Vendor() {
        super();
    }

    public Vendor(String id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
