package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.model.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee setToManager(Employee employee, Employee manager){
        Employee currentEmployee = employeeRepository.findOne(employee.getEmployeeNumber());
        if (!currentEmployee.getDptNumber().equals(manager.getDptNumber())){
//            currentEmployee.setManager(manager.getEmployeeNumber());
        }
        return employeeRepository.findOne(employee.getEmployeeNumber())
    }


}
