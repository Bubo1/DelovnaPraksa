package com.iwm.employee;

import org.axonframework.common.Assert;
import org.axonframework.domain.IdentifierFactory;

import java.io.Serializable;

/**
 * Created by Bubo on 6/16/2016.
 */
public class EmployeeId implements Serializable {

    private static final long serialVersionUID = -2521069615900157076L;
    private final String identifier;
    private final int hashCode;

    public EmployeeId() {
        this.identifier = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = identifier.hashCode();
    }

    public EmployeeId(String identifier) {
        Assert.notNull(identifier, "Identifier may not be null");
        this.identifier = identifier;
        this.hashCode = identifier.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeId employeeId = (EmployeeId) o;

        return identifier.equals(employeeId.identifier);

    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
