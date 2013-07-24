package com.tarunbk.example.jersey2.simpleclient;

import com.tarunbk.example.jersey2.simpleclient.dao.TimeDao;
import com.tarunbk.example.jersey2.simpleclient.model.Time;

public class App {

    public static void main(String[] args) {
        TimeDao timeDao = new TimeDao();
        Time time = timeDao.getRemoteTime();
        System.out.println(String.format("The time is : %s", time));
    }

}
