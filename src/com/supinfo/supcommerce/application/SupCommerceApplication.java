package com.supinfo.supcommerce.application;

import com.sun.jersey.api.core.PackagesResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author Alexandre Nguyen <alex.nr@hotmail.co.jp>
 */
@ApplicationPath("/resources")
public class SupCommerceApplication extends PackagesResourceConfig {

    public SupCommerceApplication() {
        super("com.supinfo.supcommerce.resources");
    }
}
