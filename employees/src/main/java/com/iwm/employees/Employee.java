package com.iwm.employees;

import com.iwm.employee.EmployeeCreatedEvent;
import com.iwm.employee.EmployeeId;
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

    @EventHandler
    public void onEmployeeCreated(EmployeeCreatedEvent event) {
        this.employeeId = event.getEmployeeId();
    }

    @Override
    public EmployeeId getIdentifier() {
        return employeeId;
    }
}
