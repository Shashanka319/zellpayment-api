package com.zellpayment.repository;

import com.zellpayment.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository  extends JpaRepository<Transactions,Long> {
}
