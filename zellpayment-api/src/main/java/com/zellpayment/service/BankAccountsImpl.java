package com.zellpayment.service;

import com.zellpayment.repository.BankAccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankAccountsImpl implements BankAccountsService {
    @Autowired
    private BankAccountsRepository bankAccountsRepository;
}
