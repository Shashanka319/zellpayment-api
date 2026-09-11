package com.zellpayment.service;

import com.zellpayment.repository.BankAccountsRepository;
import com.zellpayment.repository.TransactionLimitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionLimitsImpl implements TransactionLimitsService {
    @Autowired
    private TransactionLimitsRepository transactionLimitsRepository;
}
