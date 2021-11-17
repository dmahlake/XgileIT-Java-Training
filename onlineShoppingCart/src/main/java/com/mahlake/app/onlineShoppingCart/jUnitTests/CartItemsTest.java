package com.mahlake.app.onlineShoppingCart.jUnitTests;

import com.mahlake.app.onlineShoppingCart.api.service.CartService;
import com.mahlake.app.onlineShoppingCart.persistence.model.Cart;
import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import com.mahlake.app.onlineShoppingCart.persistence.model.Product;
import com.mahlake.app.onlineShoppingCart.persistence.repository.CartRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartItemsTest {

    @MockBean
    private CartRepo cartRepo;

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private CartService service;

   /* @Test
    public void addToCart(){

        Product product = testEntityManager.find(Product.class, 2);
        Customer customer = testEntityManager.find(Customer.class, 1);

        Cart newCart = new Cart();
        newCart.setCustomer(customer);
        newCart.setProduct(product);
        newCart.setCartId(3);
        newCart.setQuantity(2);
        newCart.setPrice(50.00);
        newCart.setTotal(100.00);
        Cart saveCart = cartRepo.save(newCart);
        assertTrue(saveCart.getCartId() > 0);

        when(cartRepo.save(newCart)).thenReturn(newCart);
       assertEquals(newCart, service.placeOrder(newCart));
    }*/

    @Test
    public void listOrderTest()
    {

    }

    @Test
    public void deleteCartTest()
    {
        Product product = testEntityManager.find(Product.class, 2);
        Customer customer = testEntityManager.find(Customer.class, 1);

        Cart cart = new Cart();
        cart.setPrice(200.00);
        cart.setQuantity(1);
        cart.setCustomer(customer);
        cart.setProduct(product);
        cart.setTotal(200.00);
        service.deleteOrder(cart.getCartId());
        verify(cartRepo,times(1)).deleteById(cart.getCartId());
    }

    @Test
    public void getCustomerTest()
    {
       // Customer customer = new Customer();

        Product product1 = testEntityManager.find(Product.class, 2);
        Customer customer1 = testEntityManager.find(Customer.class, 1);

        when(cartRepo.findAll()).thenReturn(Stream.of(new Cart(1,100,  2, 100, customer1, product1))
                .collect(Collectors.toList()));
        assertEquals(1, service.ListCustomerOrder("jj@gmail.com","john@123").size());//Compare by the size of user
    }



}
