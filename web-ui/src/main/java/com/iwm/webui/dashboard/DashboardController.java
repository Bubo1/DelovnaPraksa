package com.iwm.webui.dashboard;

import com.iwm.api.employee.CreateEmployeeMKCommand;
import com.iwm.api.employee.CreateEmployeeUSCommand;
import com.iwm.api.employee.EmployeeId;
import com.iwm.query.employee.repositories.EmployeeQueryRepository;
import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.GenericCommandMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Bubo on 6/16/2016.
 */
@Controller
@RequestMapping("/")
public class DashboardController {

    private final static Logger logger = LoggerFactory.getLogger(DashboardController.class);

    private EmployeeQueryRepository employeeQueryRepository;
    private CommandBus commandBus;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    public DashboardController(EmployeeQueryRepository employeeQueryRepository,
                               CommandBus commandBus) {
        this.employeeQueryRepository = employeeQueryRepository;
        this.commandBus = commandBus;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("employees", employeeQueryRepository.findAll());
        return "dashboard/index";
    }

    @RequestMapping(value = "create-employee-mk", method = RequestMethod.POST)
    public String createEmployeeMK(@RequestParam String name, @RequestParam String embg, Model model) {
        EmployeeId employeeId = new EmployeeId();
        logger.debug(name);
        CreateEmployeeMKCommand command = new CreateEmployeeMKCommand(employeeId, name, embg);
        commandBus.dispatch(new GenericCommandMessage<>(command));
        return employeeId.toString();
    }

    @RequestMapping(value = "create-employee-us", method = RequestMethod.POST)
    public String createEmployeeUS(@RequestParam String name, @RequestParam String ssn, Model model) {
        EmployeeId employeeId = new EmployeeId();
        logger.debug(name);
        CreateEmployeeUSCommand command = new CreateEmployeeUSCommand(employeeId, name, ssn);
        commandBus.dispatch(new GenericCommandMessage<>(command));
        return employeeId.toString();
    }
}
