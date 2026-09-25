package com.zellpayment.service;

import com.zellpayment.exception.BankAccountException;
import com.zellpayment.modal.BankAccountsTO;

import java.util.List;

public interface BankAccountsService {
    List<BankAccountsTO> getBankAccounts() throws BankAccountException;
}
