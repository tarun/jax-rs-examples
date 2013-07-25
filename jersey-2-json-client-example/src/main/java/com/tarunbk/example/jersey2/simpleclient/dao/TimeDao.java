package com.tarunbk.example.jersey2.simpleclient.dao;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.tarunbk.example.jersey2.simpleclient.model.Time;

public class TimeDao {

    private static final String TIME_ENDPOINT = "http://stormy-winter-5310.herokuapp.com/time.json";

    public Time getRemoteTime() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(TIME_ENDPOINT);
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();
        if (response != null && Status.Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
            Time time = response.readEntity(Time.class);
            return time;
        } else {
            System.err.println("There was an error fetching service response");
            System.err.println(response);
            return null;
        }
    }
}
