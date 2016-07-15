package com.iwm.query.employment;

import com.iwm.api.employment.EmploymentCreatedEvent;
import com.iwm.query.employee.repositories.EmployeeQueryRepository;
import com.iwm.query.employment.repositories.EmploymentQueryRepository;
import org.axonframework.eventhandling.annotation.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Bubo on 7/15/2016.
 */
@Component
public class EmploymentListener {

    private final static Logger logger = LoggerFactory.getLogger(EmploymentListener.class);

    private EmploymentQueryRepository employmentQueryRepository;

    private EmployeeQueryRepository employeeQueryRepository;

    @EventHandler
    public void handleEmploymentCreated(EmploymentCreatedEvent event) {
        EmploymentEntry employmentEntry = new EmploymentEntry();

        employmentEntry.setEmployee(employeeQueryRepository.findByIdentifier(event.getEmployeeId().toString()));

        employmentEntry.setCreatedDate(event.getCreatedDate());
        employmentEntry.setStartDate(event.getStartDate());
        employmentEntry.setEndDate(event.getEndDate());

        employmentQueryRepository.save(employmentEntry);
        logger.debug("Saving employment to repository");

    }

    @Autowired
    public void setEmploymentRepository(EmploymentQueryRepository employmentQueryRepository) {
        this.employmentQueryRepository = employmentQueryRepository;
    }

    @Autowired
    public void setEmployeeRepository(EmployeeQueryRepository employeeQueryRepository) {
        this.employeeQueryRepository = employeeQueryRepository;
    }

}
