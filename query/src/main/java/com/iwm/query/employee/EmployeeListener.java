package com.iwm.query.employee;

import com.iwm.api.employee.EmployeeCreatedEvent;
import com.iwm.query.employee.repositories.EmployeeQueryRepository;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bubo on 6/16/2016.
 */
@Component
public class EmployeeListener {

    private EmployeeQueryRepository employeeQueryRepository;

    @EventHandler
    public void handleUserCreated(EmployeeCreatedEvent event) {
        EmployeeEntry employeeEntry = new EmployeeEntry();
        employeeEntry.setIdentifier(event.getEmployeeId().toString());
        employeeEntry.setName(event.getName());

        employeeQueryRepository.save(employeeEntry);
    }

    @Autowired
    public void setEmployeeRepository(EmployeeQueryRepository employeeQueryRepository) {
        this.employeeQueryRepository = employeeQueryRepository;
    }

}

