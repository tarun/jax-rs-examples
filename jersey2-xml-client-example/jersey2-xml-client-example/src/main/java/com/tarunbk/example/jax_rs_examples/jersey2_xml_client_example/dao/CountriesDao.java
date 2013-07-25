package com.tarunbk.example.jax_rs_examples.jersey2_xml_client_example.dao;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class CountriesDao {

    private static final String COUNTRY_LIST_ENDPOINT = "http://www.fao.org/countryprofiles/geoinfo/ws/allCountries";

    public void getAllCountries() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(COUNTRY_LIST_ENDPOINT).path("EN"); // in english
        Builder builder = target.request(); // unfortunately the above service does not take media type but does return xml
        Response response = builder.get();
        if (response != null &&
                response.getStatusInfo() != null &&
                response.getStatusInfo().getFamily() == Status.Family.SUCCESSFUL) {
            System.out.println("The response was");
            System.out.println(response.readEntity(String.class));
        } else {
            System.err.println("Error getting response from remote server");
            if (response != null) {
                System.out.println(response.getStatusInfo());
            }
        }

    }
}
