package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.model.Department;
import io.zipcoder.persistenceapp.model.Employee;
import io.zipcoder.persistenceapp.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }
//    public Department assignEmployeeToManager(Employee employee, Department department){
//        return departmentRepository.save(department);
//    }



}
