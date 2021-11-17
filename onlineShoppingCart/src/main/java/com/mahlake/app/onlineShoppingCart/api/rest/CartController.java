package com.mahlake.app.onlineShoppingCart.api.rest;

import com.mahlake.app.onlineShoppingCart.api.service.CartService;
import com.mahlake.app.onlineShoppingCart.api.service.CustomerService;
import com.mahlake.app.onlineShoppingCart.persistence.model.Cart;
import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer/")
public class CartController {

    @Autowired
    CustomerService service;
    @Autowired
    private CartService cartService;

    @PostMapping(value = "placeorder/{prodId}/")
    public String placeOrder(@RequestBody Cart cart, @PathVariable int prodId, @RequestParam Customer customer)
    {
        cartService.placeOrder(cart, prodId, customer);
        return "Your order was placed successfully";
    }


    @GetMapping(value = "allorders/")
    public List<Cart> allOrder( @RequestParam String email, @RequestParam String password)
    {

       return cartService.ListCustomerOrder(email, password);//(customer, email, password);
    }



    @PutMapping(value= "/updateorder/{id}")
    public String updateCart(@PathVariable int id, @RequestBody Cart cart)
    {
        cartService.updateOrder(cart, id);
        return "Successfully updated";
    }


    @DeleteMapping(value= "delete/{id}")
    public String deleteCart(@PathVariable int id)
    {
        cartService.deleteOrder(id);
        return "Cart order successfully deleted";
    }


}
