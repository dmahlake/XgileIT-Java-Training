package com.mahlake.app.onlineShoppingCart.api.rest;

import com.mahlake.app.onlineShoppingCart.api.service.CartService;
import com.mahlake.app.onlineShoppingCart.persistence.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping(value = "/customer/placeorder/{prodId}/{custId}")
    public String placeOrder(@RequestBody Cart cart, @PathVariable int prodId, @PathVariable int custId)
    {
        cartService.placeOrder(cart, prodId, custId);
        return "Your order was placed successfully";
    }

    @GetMapping(value = "/customer/allorders")
    public List<Cart> allOrder()
    {
       return cartService.ListCustomerOrder();
    }


    @PutMapping(value= "/customer/updateorder/{id}")
    public String updateCart(@PathVariable int id, @RequestBody Cart cart)
    {
        cartService.updateOrder(cart, id);
        return "Successfully updated";
    }

    @DeleteMapping(value= "customer/delete/{id}")
    public String deleteCart(@PathVariable int id)
    {
        cartService.deleteOrder(id);
        return "Cart order successfully deleted";
    }


}
