package com.iwm.query.employment;

import com.iwm.query.employee.EmployeeEntry;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Bubo on 7/15/2016.
 */
@Entity
public class EmploymentEntry implements Serializable {

    @Id
    @javax.persistence.Id
    private String identifier;

    @OneToOne
    private EmployeeEntry employee;

    private Date createdDate;
    private Date startDate;
    private Date endDate;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public EmployeeEntry getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntry employee) {
        this.employee = employee;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
