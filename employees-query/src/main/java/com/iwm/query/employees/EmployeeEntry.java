package com.iwm.query.employees;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * Created by Bubo on 6/16/2016.
 */
public class EmployeeEntry implements Serializable {

    @Id
    @javax.persistence.Id
    private String identifier;
    private String name;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
