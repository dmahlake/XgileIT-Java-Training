package com.mahlake.app.onlineShoppingCart.api.service;

import com.mahlake.app.onlineShoppingCart.persistence.model.Employee;
import com.mahlake.app.onlineShoppingCart.persistence.model.Product;
import com.mahlake.app.onlineShoppingCart.persistence.repository.EmployeeRepo;
import com.mahlake.app.onlineShoppingCart.persistence.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Product> allProduct()
    {
        return productRepo.findAll();
    }

    public void addNewProducts(Product request)
    {
        Employee employee = employeeRepo.findById(2).get();
        Product product = new Product();
        product.setProductName(request.getProductName());
        product.setProductDescription(request.getProductDescription());
        product.setQuantity(request.getQuantity());
        product.setNumberSold(request.getNumberSold());
        product.setEmployee(employee);
        productRepo.save(product);
    }

    public void updateProduct(int id, Product request)
    {
        Product updateProd = productRepo.findById(id).get();
        Employee emp = employeeRepo.findById(2).get();
        updateProd.setProductName(request.getProductName());
        updateProd.setProductDescription(request.getProductDescription());
        updateProd.setQuantity(request.getQuantity());
        updateProd.setNumberSold(request.getNumberSold());
        updateProd.setEmployee(emp);
        productRepo.save(updateProd);

    }

    public  void deleteProduct()
    {

    }
}
