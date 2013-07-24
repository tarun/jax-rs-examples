package com.tarunbk.example.jersey2.simpleclient.dao;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.tarunbk.example.jersey2.simpleclient.model.Time;

public class TimeDao {

    public Time getRemoteTime() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://json-time.appspot.com/time.json");
        Response response = target.request(MediaType.APPLICATION_JSON_TYPE).get();
        if (response != null && Status.Family.SUCCESSFUL == response.getStatusInfo().getFamily()) {
            // System.out.println("The response string was : " + response.readEntity(String.class));
            Time time = response.readEntity(Time.class);
            // time.setDatetime(responseEntityText);
            return time;
        } else {
            return null;
        }
    }
}
