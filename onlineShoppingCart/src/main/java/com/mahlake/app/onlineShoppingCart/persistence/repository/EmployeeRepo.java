package com.mahlake.app.onlineShoppingCart.persistence.repository;

import com.mahlake.app.onlineShoppingCart.persistence.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
