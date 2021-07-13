package bbs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bbs.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByRecieverAccountNumberEquals(String accountNumber);
    List<Transaction> findBySenderAccountNumberEquals(String accountNumber);
    


}
