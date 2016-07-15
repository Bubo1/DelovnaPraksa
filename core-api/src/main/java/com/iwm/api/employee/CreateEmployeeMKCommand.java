package com.iwm.api.employee;

import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

/**
 * Created by Bubo on 6/16/2016.
 */
public class CreateEmployeeMKCommand {

    @TargetAggregateIdentifier
    private EmployeeId employeeId;
    private String name;
    private String embg;

    public CreateEmployeeMKCommand(EmployeeId employeeId, String name, String embg) {

        this.employeeId = employeeId;
        this.name = name;
        this.embg = embg;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmbg() {
        return embg;
    }
}
