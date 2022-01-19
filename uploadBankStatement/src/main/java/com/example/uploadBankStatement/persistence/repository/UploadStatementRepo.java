package com.example.uploadBankStatement.persistence.repository;

import com.example.uploadBankStatement.persistence.entity.UploadStatement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UploadStatementRepo extends JpaRepository<UploadStatement, Long> {


    @Query(nativeQuery = true, value = "SELECT * FROM statement WHERE amount=:amount AND description=:description AND transaction_date=:transactionDate")
    Optional<UploadStatement> findByAmountAndDescription(double amount, String description, String transactionDate);

}
