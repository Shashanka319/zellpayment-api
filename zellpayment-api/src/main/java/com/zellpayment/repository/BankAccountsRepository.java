package com.zellpayment.repository;

import com.zellpayment.entity.BankAccounts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountsRepository  extends JpaRepository<BankAccounts, Long> {
}
