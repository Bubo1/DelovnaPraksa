package com.iwm.employment;

import com.iwm.api.employment.CreateEmploymentCommand;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Bubo on 7/15/2016.
 */
public class EmploymentCommandHandler {

    private Repository<Employment> repository;

    private final static Logger logger = LoggerFactory.getLogger(EmploymentCommandHandler.class);

    @CommandHandler
    public void handleCreateEmployment(CreateEmploymentCommand command) {
        Employment employment = new Employment(command.getEmploymentId(), command.getEmployeeId(), command.getCreatedDate(), command.getStartDate(), command.getEndDate());
        repository.add(employment);
    }

    @Autowired
    @Qualifier("employmentRepository")
    public void setRepository(Repository<Employment> employmentRepository) {
        this.repository = employmentRepository;
    }
}
