package com.mahlake.app.onlineShoppingCart.api.service;


import com.mahlake.app.onlineShoppingCart.persistence.model.Employee;
import com.mahlake.app.onlineShoppingCart.persistence.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> allEmployee()
    {
        return employeeRepo.findAll();
    }

    public void addEmployees(Employee request)
    {
        Employee employee = new Employee();
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setPosition(request.getPosition());
        employeeRepo.save(employee);
    }

    public void updateEmployee(Employee request, int id)
    {
        Employee update = employeeRepo.findById(id).get();
        update.setFirstName(request.getFirstName());
        update.setLastName(request.getLastName());
        update.setPosition(request.getPosition());
        employeeRepo.save(update);
    }

    public void deleteEmployee(int id)
    {
        Employee deleteEmp = employeeRepo.findById(id).get();
        employeeRepo.delete(deleteEmp);
    }


}
