package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.model.Employee;
import io.zipcoder.persistenceapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
            currentEmployee.setManager(manager.getEmployeeNumber());
        }
        return currentEmployee;
    }

    public Employee update(Employee employee){
        Employee currentEmployeeStuff = employeeRepository.findOne(employee.getEmployeeNumber());
        currentEmployeeStuff.setFirstName(employee.getFirstName());
        currentEmployeeStuff.setLastName(employee.getLastName());
        currentEmployeeStuff.setEmail(employee.getEmail());
        currentEmployeeStuff.setDptNumber(employee.getDptNumber());
        currentEmployeeStuff.setTitle(employee.getTitle());
        currentEmployeeStuff.setPhoneNumber(employee.getPhoneNumber());
        currentEmployeeStuff.setHireDate(employee.getHireDate());
        return currentEmployeeStuff;
    }

    public List<Employee> getAllEmployeesByManager(Long id){
        List<Employee> employees = new ArrayList<>();
        List<Employee> allEmployees = employeeRepository.findAll();
        for (Employee employee: allEmployees){
            if (employee.getManager().equals(id)){
                employees.add(employee);
            }
        }
        return employees;
    }

    public List<Employee> getManagerHierarchy(Employee employee, Long id){
        List<Employee> employeeManagement = new ArrayList<>();
        List<Employee> allEmployees = employeeRepository.findAll();
//        for (Employee employee: allEmployees){
//            if (employee.getManager().equals(id)){
//                employees.add(employee);git add .

//            }
//        }
        return null;
    }

}
