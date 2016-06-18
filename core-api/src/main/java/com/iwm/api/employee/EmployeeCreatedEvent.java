package com.iwm.api.employee;

/**
 * Created by Bubo on 6/16/2016.
 */
public class EmployeeCreatedEvent {

    private EmployeeId employeeId;
    private String name;

    public EmployeeCreatedEvent(EmployeeId employeeId, String name) {
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
