package com.iwm.query.employees;

import com.iwm.employee.EmployeeCreatedEvent;
import com.iwm.query.employees.repositories.EmployeeQueryRepository;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bubo on 6/16/2016.
 */
@Component
public class EmployeeListener {

    private EmployeeQueryRepository employeeRepository;

    @EventHandler
    public void handleUserCreated(EmployeeCreatedEvent event) {
        EmployeeEntry employeeEntry = new EmployeeEntry();
        employeeEntry.setIdentifier(event.getEmployeeId().toString());
        employeeEntry.setName(event.getName());

        employeeRepository.save(employeeEntry);
    }

    @Autowired
    public void setEmployeeRepository(EmployeeQueryRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

}

