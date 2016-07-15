package com.iwm.api.employee;

/**
 * Created by Bubo on 6/16/2016.
 */
public class EmployeeUSCreatedEvent {

    private EmployeeId employeeId;
    private String name;
    private String ssn;

    public EmployeeUSCreatedEvent(EmployeeId employeeId, String name, String ssn) {
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
