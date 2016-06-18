package com.iwm.employee;

import com.iwm.api.employee.CreateEmployeeCommand;
import com.iwm.api.employee.EmployeeId;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Bubo on 6/16/2016.
 */
public class EmployeeCommandHandler {

    private Repository<Employee> repository;

    @CommandHandler
    public EmployeeId handleCreateEmployee(CreateEmployeeCommand command) {
        EmployeeId employeeId = command.getEmployeeId();
        Employee employee = new Employee(employeeId, command.getName());
        repository.add(employee);
        return employeeId;
    }

    private Employee onEmployee(String employeeId) {
        return repository.load(new EmployeeId(employeeId), null);
    }

    @Autowired
    @Qualifier("employeeRepository")
    public void setRepository(Repository<Employee> userRepository) {
        this.repository = userRepository;
    }

}