package com.iwm.query.employment.repositories;

import com.iwm.query.employment.EmploymentEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Bubo on 7/15/2016.
 */
public interface EmploymentQueryRepository extends MongoRepository<EmploymentEntry, String> {


}
