package com.tarunbk.example.jaxrs.inventory.service.vendor;

import static com.tarunbk.example.jaxrs.inventory.service.vendor.VendorsResource.VENDORS;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.tarunbk.example.jaxrs.inventory.model.vendor.Vendor;

@Path("/")
public class VendorResource {

    @GET
    @Path("/{vendorId}")
    @Produces({ APPLICATION_JSON, APPLICATION_XML })
    public Vendor getVendor(@PathParam("vendorId") String vendorId) {
        if (vendorId != null) {
            return VENDORS.get(vendorId);
        }
        return null;
    }

    @POST
    @Consumes({ APPLICATION_JSON, APPLICATION_XML })
    public Vendor createVendor(Vendor vendor) {
        if (vendor != null) {
            String id = String.valueOf(VENDORS.size() + 1);
            vendor.setId(id);
            VENDORS.put(id, vendor);
            return vendor;
        }
        return null;
    }
}
