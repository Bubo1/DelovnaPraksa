package com.iwm.employees;

import com.iwm.employee.CreateEmployeeCommand;
import com.iwm.employee.EmployeeId;
import com.iwm.query.employees.repositories.EmployeeQueryRepository;
import org.axonframework.commandhandling.annotation.CommandHandler;
import org.axonframework.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Bubo on 6/16/2016.
 */
@Component
public class EmployeeCommandHandler {

    private Repository<Employee> repository;

    private EmployeeQueryRepository employeeQueryRepository;

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
    @Qualifier("userRepository")
    public void setRepository(Repository<Employee> userRepository) {
        this.repository = userRepository;
    }

    @Autowired
    public void setUserRepository(EmployeeQueryRepository userRepository) {
        this.employeeQueryRepository = userRepository;
    }

}
