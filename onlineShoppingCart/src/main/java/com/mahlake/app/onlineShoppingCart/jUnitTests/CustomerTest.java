package com.mahlake.app.onlineShoppingCart.jUnitTests;


import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import com.mahlake.app.onlineShoppingCart.persistence.repository.CustomerRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

//@ExtendWith(SpringExtension.class)
//@DataJpaTest

@SpringBootTest
public class CustomerTest {

    @Autowired
    private CustomerRepo customerRepo;

    @Test
    public void createCustomer()
    {
        Customer customer = new Customer();
        customer.setCustomerId(5);
        customer.setFirstName("Lucia");
        customer.setLastName("Masiye");
        customer.setEmailAddres("lucia@yahoo.com");
        customer.setPassword("123456");
        customer.setPhoneNumber(785965782);
        customer.setAddress("Mpumalanga");
        customerRepo.save(customer);
        assertNotNull(customerRepo.findById(5).get());

    }
}
