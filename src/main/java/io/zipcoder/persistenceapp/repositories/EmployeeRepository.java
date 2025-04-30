package io.zipcoder.persistenceapp.repositories;

import io.zipcoder.persistenceapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
