package com.tarunbk.example.jaxrs.inventory.service.vendor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.tarunbk.example.jaxrs.inventory.model.vendor.Vendor;

@Path("/")
public class VendorResource {

    @GET
    @Path("/{vendorId}")
    public Vendor getVendor(@PathParam("vendorId") String vendorId) {
        if (vendorId != null) {
            Vendor vendor = new Vendor();
            vendor.setId(vendorId);
            vendor.setName("Test Vendor");
            return vendor;
        }
        return null;
    }
}
