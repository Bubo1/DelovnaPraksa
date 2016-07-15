package com.iwm.api.employment;

import com.iwm.api.employee.EmployeeId;
import org.axonframework.commandhandling.annotation.TargetAggregateIdentifier;

import java.util.Date;

/**
 * Created by Bubo on 7/15/2016.
 */
public class CreateEmploymentCommand {

    @TargetAggregateIdentifier
    private EmploymentId employmentId;
    private EmployeeId employeeId;
    private Date createdDate;
    private Date startDate;
    private Date endDate;

    public CreateEmploymentCommand(EmploymentId employmentId, EmployeeId employeeId, Date createdDate, Date startDate, Date endDate) {
        this.employmentId = employmentId;
        this.employeeId = employeeId;
        this.createdDate = createdDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public EmploymentId getEmploymentId() {
        return employmentId;
    }

    public EmployeeId getEmployeeId() {
        return employeeId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
}
