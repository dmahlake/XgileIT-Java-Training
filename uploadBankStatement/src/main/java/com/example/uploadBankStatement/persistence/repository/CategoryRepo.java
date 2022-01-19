package com.example.uploadBankStatement.persistence.repository;

import com.example.uploadBankStatement.persistence.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Categories, Long> {


}
