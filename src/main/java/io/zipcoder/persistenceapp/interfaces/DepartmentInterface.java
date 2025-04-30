package io.zipcoder.persistenceapp.interfaces;

import io.zipcoder.persistenceapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentInterface extends JpaRepository<Department, Long> {
}
