package com.iwm.webui.dashboard;

import com.iwm.query.employee.repositories.EmployeeQueryRepository;
import org.axonframework.commandhandling.CommandBus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Bubo on 6/16/2016.
 */
@Controller
@RequestMapping("/dashboard")
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
    public String get(Model model) {
        model.addAttribute("employees", employeeQueryRepository.findAll());
        return "dashboard/dashboard";
    }
}
