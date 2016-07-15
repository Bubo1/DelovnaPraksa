package com.iwm.employment;

import com.iwm.api.employment.EmploymentCreatedEvent;
import com.iwm.api.employment.EmploymentId;
import com.iwm.api.employee.EmployeeId;
import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;

import java.util.Date;

/**
 * Created by Bubo on 7/9/2016.
 */
public class Employment extends AbstractAnnotatedAggregateRoot {

    private static final long serialVersionUID = 4759400065509288864L;

    @AggregateIdentifier
    private EmploymentId employmentId;

    public Employment() {
    }

    public Employment(EmploymentId employmentId, EmployeeId employeeId, Date createdDate, Date startDate, Date endDate) {
        apply(new EmploymentCreatedEvent(employmentId, employeeId, createdDate, startDate, endDate));
    }

    @Override
    public EmploymentId getIdentifier() {
        return employmentId;
    }

}
