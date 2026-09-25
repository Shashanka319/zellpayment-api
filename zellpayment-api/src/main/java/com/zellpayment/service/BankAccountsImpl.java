package com.zellpayment.service;

import com.zellpayment.entity.BankAccounts;
import com.zellpayment.exception.BankAccountException;
import com.zellpayment.modal.BankAccountsTO;
import com.zellpayment.repository.BankAccountsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
@Slf4j
@Service
public class BankAccountsImpl implements BankAccountsService {
    @Autowired
    private BankAccountsRepository bankAccountsRepository;

    @Override
    public List<BankAccountsTO> getBankAccounts() throws BankAccountException {
        log.info("Inside the BankAccountsImpl getBankAccounts method");
        List<BankAccounts> bankAccounts = bankAccountsRepository.findAll();
        if(CollectionUtils.isEmpty(bankAccounts)) {
            log.error("Bank Accounts are empty");
            throw new BankAccountException("Bank Accounts are empty");
        }
        return (List<BankAccountsTO>) bankAccounts.stream().map(ba -> {
            BankAccountsTO to = new BankAccountsTO();
            to.setAccId(ba.getAccId());
            to.setBankName(ba.getBankName());
            to.setUser(ba.getUser());
            to.setAccNo(ba.getAccNo());
            to.setIfscCode(ba.getIfscCode());
            to.setIsPrimary(ba.getIsPrimary());
            to.setCreatedAt(ba.getCreatedAt());
            to.setAliases(ba.getAliases());
            return to;
        });
    }
}
