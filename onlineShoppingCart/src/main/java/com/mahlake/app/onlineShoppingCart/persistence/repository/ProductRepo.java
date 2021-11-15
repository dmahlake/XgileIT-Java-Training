package com.mahlake.app.onlineShoppingCart.persistence.repository;

import com.mahlake.app.onlineShoppingCart.persistence.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
