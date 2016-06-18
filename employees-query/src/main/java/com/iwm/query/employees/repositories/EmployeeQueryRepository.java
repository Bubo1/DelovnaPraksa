package com.iwm.query.employees.repositories;

import com.iwm.query.employees.EmployeeEntry;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Bubo on 6/16/2016.
 */

public interface EmployeeQueryRepository extends PagingAndSortingRepository<EmployeeEntry, String> {

    EmployeeEntry findByUsername(String username);

    EmployeeEntry findByIdentifier(String identifier);

}
