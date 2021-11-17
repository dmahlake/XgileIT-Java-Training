package com.mahlake.app.onlineShoppingCart.jUnitTests;
import com.mahlake.app.onlineShoppingCart.api.service.CustomerService;
import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import com.mahlake.app.onlineShoppingCart.persistence.repository.CustomerRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTest {

    @Autowired
    CustomerService service;

    @MockBean
    private CustomerRepo customerRepo;

    @Test
    public void getCustomerTest()
    {
        when(customerRepo.findAll()).thenReturn(Stream.of(new Customer(1,"Dipuo", "Mahlake",
                "dede@gmail.com", "philadi@123",607400172,"Centuion"))
                .collect(Collectors.toList()));
        assertEquals(1, service.allCustomers().size());//Compare by the size of user
    }

    @Test
    public void addCustomerTest()
    {
       Customer customer = new Customer();
       customer.setFirstName("Lucia");
       customer.setLastName("Masiye");
       customer.setEmailAddres("masiyel@yahoo.com");
       customer.setPassword("lmasiye@1");
       customer.setPhoneNumber(601260011);
       customer.setAddress("Mpumalanga");
       when(customerRepo.save(customer)).thenReturn(customer);
       assertEquals(customer, service.createCustomer(customer));
    }

    @Test
    public void deleteCustomerTest()
    {
        Customer customer = new Customer();
        customer.setFirstName("Temosho");
        customer.setLastName("Chiloane");
        customer.setEmailAddres("nicole@gmail.com");
        customer.setPassword("123456");
        customer.setPhoneNumber(607400178);
        customer.setAddress("Germiston");
        service.deleteAccount(customer.getCustomerId());
        verify(customerRepo,times(1)).deleteById(customer.getCustomerId());
    }

}
