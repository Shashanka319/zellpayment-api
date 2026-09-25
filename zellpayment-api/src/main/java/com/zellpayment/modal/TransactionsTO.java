package com.zellpayment.modal;

import com.zellpayment.entity.BankAccounts;
import com.zellpayment.entity.TransactionLogs;
import com.zellpayment.entity.Users;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class TransactionsTO {
    private Long transactionId;

    private Users senderUser;

    private Users receiverUser;

    private BankAccounts senderAccount;

    private BankAccounts receiverAccount;

    private BigDecimal amount;

    private String currency;

    private String status;

    private String refNote;

    private LocalDateTime createdAt;

    private LocalDateTime completedAt;

    private List<TransactionLogs> transactionLogs;
}
