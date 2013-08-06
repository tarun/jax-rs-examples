package com.tarunbk.example.jaxrs.inventory.service.vendor;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.tarunbk.example.jaxrs.inventory.model.vendor.Vendor;

@Path("/")
public class VendorsResource {

    public static Map<String, Vendor> VENDORS = new TreeMap<>();
    static {
        VENDORS.put("1", new Vendor("1", "Random House"));
    }

    @GET
    @Produces({ APPLICATION_JSON, APPLICATION_XML })
    public List<Vendor> getVendors() {
        List<Vendor> vendorList = new ArrayList<>();
        vendorList.addAll(VENDORS.values());
        return vendorList;
    }

    @Path("/count")
    @GET
    public Integer getCount() {
        return VENDORS.size();
    }
}
