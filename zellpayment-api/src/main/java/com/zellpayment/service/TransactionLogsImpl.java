package com.zellpayment.service;

import com.zellpayment.repository.TransactionLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionLogsImpl implements TransactionLogsService {
    @Autowired
    private TransactionLogsRepository transactionLogsRepository;
}
