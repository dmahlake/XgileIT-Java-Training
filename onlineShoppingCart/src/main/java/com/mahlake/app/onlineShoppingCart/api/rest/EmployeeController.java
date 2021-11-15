package com.mahlake.app.onlineShoppingCart.api.rest;


import com.mahlake.app.onlineShoppingCart.api.service.EmployeeService;
import com.mahlake.app.onlineShoppingCart.persistence.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public List<Employee> employeeList()
    {
        return employeeService.allEmployee();
    }

    @PostMapping(value = "/employee/addemployee")
    public String newEmployees(@RequestBody Employee employee)
    {
        employeeService.addEmployees(employee);
        return "Employee successfully added";
    }

    @PutMapping(value = "/employee/updateemployee/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable int id)
    {
        employeeService.updateEmployee(employee, id);
        return "successfully Updated...";
    }

    @DeleteMapping(value= "/employee/delete/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        employeeService.deleteEmployee(id);
        return "Employee successfully deleted";
    }
}
