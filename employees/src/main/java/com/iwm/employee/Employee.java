package com.iwm.employee;

import com.iwm.api.employee.EmployeeCreatedEvent;
import com.iwm.api.employee.EmployeeId;
import com.iwm.api.employee.EmployeeMKCreatedEvent;
import com.iwm.api.employee.EmployeeUSCreatedEvent;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;

/**
 * Created by Bubo on 6/16/2016.
 */
public class Employee extends AbstractAnnotatedAggregateRoot {

    private static final long serialVersionUID = 3291411359839192350L;

    @AggregateIdentifier
    private EmployeeId employeeId;

    public Employee() {
    }

    public Employee(EmployeeId employeeId, String name) {
        apply(new EmployeeCreatedEvent(employeeId, name));
    }

    public void createEmployeeEntryMK(EmployeeId employeeId, String name, String embg) {
        apply(new EmployeeMKCreatedEvent(employeeId, name, embg));
    }

    public void createEmployeeEntryUS(EmployeeId employeeId, String name, String ssn) {
        apply(new EmployeeUSCreatedEvent(employeeId, name, ssn));
    }

    @EventHandler
    public void onEmployeeCreated(EmployeeCreatedEvent event) {
        this.employeeId = event.getEmployeeId();
    }

    @Override
    public EmployeeId getIdentifier() {
        return employeeId;
    }
}
