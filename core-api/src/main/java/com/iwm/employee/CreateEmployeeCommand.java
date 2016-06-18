package com.iwm.employee;

/**
 * Created by Bubo on 6/16/2016.
 */
public class CreateEmployeeCommand {

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
