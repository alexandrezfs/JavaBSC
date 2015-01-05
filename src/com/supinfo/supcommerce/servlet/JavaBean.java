package com.supinfo.supcommerce.servlet;

import java.io.Serializable;

/**
 * Created by alexandrenguyen on 05/01/15.
 */
class JavaBean implements Serializable {

    private int id;
    private String name;

    public JavaBean() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}