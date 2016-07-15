package com.iwm.api.employee;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by Bubo on 6/16/2016.
 */
public class CreateEmployeeUSCommand {

    @TargetAggregateIdentifier
    private EmployeeId employeeId;
    private String name;
    private String ssn;

    public CreateEmployeeUSCommand(EmployeeId employeeId, String name, String ssn) {
        this.employeeId = employeeId;
        this.name = name;
        this.ssn = ssn;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }
}
