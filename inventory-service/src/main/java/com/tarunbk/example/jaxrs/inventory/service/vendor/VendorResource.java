package com.tarunbk.example.jaxrs.inventory.service.vendor;

import static com.tarunbk.example.jaxrs.inventory.service.vendor.VendorsResource.VENDORS;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN_TYPE;
import static javax.ws.rs.core.Response.created;
import static javax.ws.rs.core.Response.ok;
import static javax.ws.rs.core.Response.serverError;
import static javax.ws.rs.core.Response.status;
import static javax.ws.rs.core.Response.Status.BAD_REQUEST;
import static javax.ws.rs.core.Response.Status.NOT_FOUND;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.tarunbk.example.jaxrs.inventory.model.vendor.Vendor;

@Path("/")
public class VendorResource {

    @GET
    @Path("/{vendorId}")
    @Produces({ APPLICATION_JSON, APPLICATION_XML })
    public Response getVendor(@PathParam("vendorId") String vendorId) {
        if (vendorId != null && !vendorId.isEmpty()) {
            Vendor vendor = VENDORS.get(vendorId);
            if (vendor != null) {
                return ok(vendor).build();
            } else {
                return status(NOT_FOUND).build();
            }
        } else {
            return status(BAD_REQUEST).entity("Please provide a vendor id in the path").type(TEXT_PLAIN_TYPE).build();
        }
    }

    @POST
    @Consumes({ APPLICATION_JSON, APPLICATION_XML })
    public Response createVendor(Vendor vendor) {
        if (vendor != null) {
            String id = String.valueOf(VENDORS.size() + 1);
            vendor.setId(id);
            VENDORS.put(id, vendor);
            URI uri;
            try {
                uri = new URI("/vendor/" + id);
                return created(uri).build();
            } catch (URISyntaxException e) {
                return serverError().build();
            }
        }
        return status(BAD_REQUEST).build();
    }
}
