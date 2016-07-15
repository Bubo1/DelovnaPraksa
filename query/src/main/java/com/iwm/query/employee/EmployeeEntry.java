package com.iwm.query.employee;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by Bubo on 6/16/2016.
 */
@Entity
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
