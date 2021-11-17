package com.mahlake.app.onlineShoppingCart.persistence.repository;

import com.mahlake.app.onlineShoppingCart.persistence.model.Cart;
import com.mahlake.app.onlineShoppingCart.persistence.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {

}
