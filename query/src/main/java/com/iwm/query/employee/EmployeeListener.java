package com.iwm.query.employee;

import com.iwm.api.employee.EmployeeMKCreatedEvent;
import com.iwm.api.employee.EmployeeUSCreatedEvent;
import com.iwm.query.employee.repositories.EmployeeQueryRepository;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bubo on 6/16/2016.
 */
@Component
public class EmployeeListener {

    private final static Logger logger = LoggerFactory.getLogger(EmployeeListener.class);

    private EmployeeQueryRepository employeeQueryRepository;

//    @EventHandler
//    public void handleEmployeeCreated(EmployeeCreatedEvent event) {
//        logger.debug(event.getName() + " " + event.getEmployeeId().toString());
//        EmployeeEntry employeeEntry = new EmployeeEntry();
//        employeeEntry.setIdentifier(event.getEmployeeId().toString());
//        employeeEntry.setName(event.getName());
//
//        employeeQueryRepository.save(employeeEntry);
//    }

    @EventHandler
    public void handleEmployeeMKCreated(EmployeeMKCreatedEvent event) {
        EmployeeEntryMK employeeEntry = new EmployeeEntryMK();
        employeeEntry.setEmbg(event.getEmbg());
        employeeEntry.setName(event.getName());
        employeeEntry.setIdentifier(event.getEmployeeId().toString());

        employeeQueryRepository.save(employeeEntry);
    }

    @EventHandler
    public void handleEmployeeUSCreated(EmployeeUSCreatedEvent event) {
        EmployeeEntryUS employeeEntry = new EmployeeEntryUS();
        employeeEntry.setSsn(event.getSsn());
        employeeEntry.setName(event.getName());
        employeeEntry.setIdentifier(event.getEmployeeId().toString());

        employeeQueryRepository.save(employeeEntry);
    }

    @Autowired
    public void setEmployeeRepository(EmployeeQueryRepository employeeQueryRepository) {
        this.employeeQueryRepository = employeeQueryRepository;
    }

}

