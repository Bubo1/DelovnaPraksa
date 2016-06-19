package com.iwm.api.employee;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by Bubo on 6/16/2016.
 */
public class CreateEmployeeCommand {

    @TargetAggregateIdentifier
    private EmployeeId employeeId;
    private String name;

    public CreateEmployeeCommand(EmployeeId employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
