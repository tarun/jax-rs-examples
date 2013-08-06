package com.tarunbk.example.jaxrs.inventory.service;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.tarunbk.example.jaxrs.inventory.model.Vendor;

@Path("/")
public class VendorsResource {

    @GET
    @Produces({ APPLICATION_JSON, APPLICATION_XML })
    public List<Vendor> getVendors() {
        List<Vendor> vendors = new ArrayList<>();
        Vendor vendor = new Vendor();
        vendor.setId("1");
        vendor.setName("Random House");
        vendors.add(vendor);

        return vendors;
    }

    @Path("/count")
    @GET
    public String getCount() {
        return "2";
    }
}
