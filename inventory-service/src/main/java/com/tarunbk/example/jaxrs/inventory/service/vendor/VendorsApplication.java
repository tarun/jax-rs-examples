package com.tarunbk.example.jaxrs.inventory.service.vendor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("vendors")
public class VendorsApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(VendorsResource.class);
        return Collections.unmodifiableSet(classes);
    }

}
