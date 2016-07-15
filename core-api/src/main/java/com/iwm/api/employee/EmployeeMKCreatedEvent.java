package com.iwm.api.employee;

/**
 * Created by Bubo on 6/16/2016.
 */
public class EmployeeMKCreatedEvent {

    private EmployeeId employeeId;
    private String name;
    private String embg;

    public EmployeeMKCreatedEvent(EmployeeId employeeId, String name, String embg) {
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
