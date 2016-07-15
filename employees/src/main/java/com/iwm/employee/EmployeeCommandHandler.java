package com.iwm.employee;

import com.iwm.api.employee.*;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Bubo on 6/16/2016.
 */
public class EmployeeCommandHandler {

    private Repository<Employee> repository;

    private final static Logger logger = LoggerFactory.getLogger(EmployeeCommandHandler.class);

    @CommandHandler
    public void handleCreateEmployee(CreateEmployeeCommand command) {
        Employee employee = new Employee(command.getEmployeeId(), command.getName());
        repository.add(employee);
    }

    @CommandHandler
    public void handleCreateEmployee(CreateEmployeeMKCommand command) {
        Employee employee = new Employee(command.getEmployeeId(), command.getName());
        repository.add(employee);
        employee.createEmployeeEntryMK(command.getEmployeeId(), command.getName(), command.getEmbg());
    }

    @CommandHandler
    public void handleCreateEmployee(CreateEmployeeUSCommand command) {
        Employee employee = new Employee(command.getEmployeeId(), command.getName());
        repository.add(employee);
        employee.createEmployeeEntryUS(command.getEmployeeId(), command.getName(), command.getSsn());
    }

    private Employee onEmployee(String employeeId) {
        return repository.load(new EmployeeId(employeeId));
    }

    @Autowired
    @Qualifier("employeeRepository")
    public void setRepository(Repository<Employee> userRepository) {
        this.repository = userRepository;
    }

}
