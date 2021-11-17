package com.mahlake.app.onlineShoppingCart.api.service;

import com.mahlake.app.onlineShoppingCart.persistence.model.Cart;
import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import com.mahlake.app.onlineShoppingCart.persistence.model.Product;
import com.mahlake.app.onlineShoppingCart.persistence.repository.CartRepo;
import com.mahlake.app.onlineShoppingCart.persistence.repository.CustomerRepo;
import com.mahlake.app.onlineShoppingCart.persistence.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CustomerService service;

    public List<Cart> ListCustomerOrder(String email, String password)
    {
        service.loginFirst(email, password);
        return cartRepo.findAll();
    }

    public Cart placeOrder(Cart request, int prodId, Customer customer)
    {
        customer = service.loginFirst(customer.getEmailAddres(), customer.getPassword());
        Cart cart = new Cart();
        Product product = productRepo.findById(prodId).get();

        cart.setQuantity(request.getQuantity());
        cart.setPrice(request.getPrice());
        cart.setTotal(request.getTotal());
        cart.setCustomer(customer);
        cart.setProduct(product);
        return cartRepo.save(cart);
    }

    public void updateOrder(Cart request, int id)
    {
        Cart updateCart = cartRepo.findById(id).get();
        Product product = productRepo.findById(3).get();
        Customer customer = customerRepo.findById(1).get();
        updateCart.setQuantity(request.getQuantity());
        updateCart.setPrice(request.getPrice());
        updateCart.setTotal(request.getTotal());
        updateCart.setProduct(product);
        cartRepo.save(updateCart);
    }


    public void deleteOrder(int id)
    {
        cartRepo.deleteById(id);
    }



}
