package com.iwm.query.employee.repositories;

import com.iwm.query.employee.EmployeeEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Bubo on 6/16/2016.
 */
public interface EmployeeQueryRepository extends MongoRepository<EmployeeEntry, String> {

    EmployeeEntry findByName(String name);

    EmployeeEntry findByIdentifier(String identifier);

}
