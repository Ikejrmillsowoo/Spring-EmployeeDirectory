package io.zipcoder.persistenceapp.interfaces;

import io.zipcoder.persistenceapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeInterface extends JpaRepository<Employee, Long> {
}
