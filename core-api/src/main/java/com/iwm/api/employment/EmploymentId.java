package com.iwm.api.employment;

import org.axonframework.common.Assert;
import org.axonframework.domain.IdentifierFactory;

import java.io.Serializable;

/**
 * Created by Bubo on 7/9/2016.
 */
public class EmploymentId implements Serializable {

    private static final long serialVersionUID = -1521062342351351076L;
    private final String identifier;
    private final int hashCode;

    public EmploymentId() {
        this.identifier = IdentifierFactory.getInstance().generateIdentifier();
        this.hashCode = identifier.hashCode();
    }

    public EmploymentId(String identifier) {
        Assert.notNull(identifier, "Identifier may not be null");
        this.identifier = identifier;
        this.hashCode = identifier.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmploymentId employmentId = (EmploymentId) o;

        return identifier.equals(employmentId.identifier);

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
