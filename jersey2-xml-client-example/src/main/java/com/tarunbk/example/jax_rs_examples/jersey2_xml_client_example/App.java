package com.tarunbk.example.jax_rs_examples.jersey2_xml_client_example;

import com.tarunbk.example.jax_rs_examples.jersey2_xml_client_example.dao.CountriesDao;
import com.tarunbk.example.jax_rs_examples.jersey2_xml_client_example.model.Countries;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        CountriesDao countriesDao = new CountriesDao();
        Countries countries = countriesDao.getAllCountries();
        System.out.println("The response was");
        System.out.println(countries);
    }
}
