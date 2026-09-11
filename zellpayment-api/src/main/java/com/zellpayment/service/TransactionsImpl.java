package com.zellpayment.service;

import com.zellpayment.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsImpl implements TransactionsService {
    @Autowired
    private TransactionsRepository transactionsRepository;
}

