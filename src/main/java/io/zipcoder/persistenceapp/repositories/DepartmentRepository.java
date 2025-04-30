package io.zipcoder.persistenceapp.repositories;

import io.zipcoder.persistenceapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
