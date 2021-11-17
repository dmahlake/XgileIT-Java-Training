package com.mahlake.app.onlineShoppingCart.api.service;

import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import com.mahlake.app.onlineShoppingCart.persistence.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService{ //implements UserDetailsService {

    @Autowired
    private CustomerRepo customerRepo;

    public Object createCustomer(Customer request)
    {
        Customer customer = new Customer();

       /* if(findByEmail(customer.getEmailAddres()).equals(request.getEmailAddres()))
        {
            return "use another email";
        }
        else {*/
            customer.setFirstName(request.getFirstName());
            customer.setLastName(request.getLastName());
            customer.setEmailAddres(request.getEmailAddres());
            customer.setPassword(request.getPassword());
            customer.setPhoneNumber(request.getPhoneNumber());
            customer.setAddress(request.getAddress());

            return customerRepo.save(customer);

    }

    public List<Customer>allCustomers()
    {
        return customerRepo.findAll();
    }

    public void updateCustomerInfo(int id, Customer request)
    {
        Customer updateInfo = customerRepo.findById(id).get();
        updateInfo.setFirstName(request.getFirstName());
        updateInfo.setLastName(request.getLastName());
        updateInfo.setEmailAddres(request.getEmailAddres());
        updateInfo.setPhoneNumber(request.getPhoneNumber());
        updateInfo.setAddress(request.getAddress());
        customerRepo.save(updateInfo);
    }

    public Customer loginFirst(String email, String password)
    {
        return customerRepo.findByEmailAddressAndPassword(email, password);
    }

    public void deleteAccount(int id)
    {
       customerRepo.deleteById(id);
    }

   /*public boolean emailExist(String email)
    {
        return customerRepo.exist(email);
    }*/

   /* public String findByEmail(String email)
    {
        customerRepo.findByEmailAddres(email);
        return email;
    }*/
}
