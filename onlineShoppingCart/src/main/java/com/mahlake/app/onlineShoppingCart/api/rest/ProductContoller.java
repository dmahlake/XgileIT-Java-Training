package com.mahlake.app.onlineShoppingCart.api.rest;


import com.mahlake.app.onlineShoppingCart.api.service.ProductService;
import com.mahlake.app.onlineShoppingCart.persistence.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product/")
public class ProductContoller {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "listallproduct")
    public List<Product> productList()
    {
        return productService.allProduct();
    }

    @PostMapping(value = "addProduct")
    public String addProduct(@RequestBody Product product)
    {
        productService.addNewProducts(product);
        return "product successfully added";
    }

    @PutMapping(value = "updateproduct/{id}")
    public String updateProducts(@RequestBody Product product, @PathVariable int id)
    {
        productService.updateProduct(id, product);
        return "Successfully updated";
    }
}
