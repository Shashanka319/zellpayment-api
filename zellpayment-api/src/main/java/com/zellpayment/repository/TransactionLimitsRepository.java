package com.zellpayment.repository;

import com.zellpayment.entity.TransactionLimits;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionLimitsRepository extends JpaRepository<TransactionLimits, Long> {
}
