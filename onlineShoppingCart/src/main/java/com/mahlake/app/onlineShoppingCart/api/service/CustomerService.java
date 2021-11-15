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

   /* @Override
    public UserDetails loadUserByUsername(String emailAddress) throws UsernameNotFoundException {
        Customer customer = customerRepo.findByEmail(emailAddress);
        if (customer == null)
            throw new UsernameNotFoundException("User not found please register");

        return new CustomerDetails(customer);
    }*/

    public void createCustomer(Customer request)
    {
        Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setEmailAddres(request.getEmailAddres());
        customer.setPassword(request.getPassword());
        customer.setPhoneNumber(request.getPhoneNumber());
        customer.setAddress(request.getAddress());
        customerRepo.save(customer);
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

    public void deleteAccount(int id)
    {
        Customer delete = customerRepo.findById(id).get();
        customerRepo.delete(delete);
    }
}
