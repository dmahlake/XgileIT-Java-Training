package com.mahlake.app.onlineShoppingCart.api.rest;


import com.mahlake.app.onlineShoppingCart.api.service.CustomerService;
import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping(value = "/allCustomers")
    public List<Customer> getCustomer()
    {
        return customerService.allCustomers();
    }

    @PostMapping(value = "/addCustomer")
    public Object addcustomer(@RequestBody Customer customer)
    {
            return customerService.createCustomer(customer);
    }

    @PutMapping(value = "update/{id}")
    public String updateCustomer(@PathVariable int id, @RequestBody Customer request)
    {
        customerService.updateCustomerInfo(id, request);
        return "Successfully updated";
    }

    @DeleteMapping(value = "delete/{id}")
    public String deleteCustomer(@PathVariable int id)
    {
        customerService.deleteAccount(id);
        return "Successfully deleted customer with id " + id;
    }



}

