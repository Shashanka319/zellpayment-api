package com.zellpayment.modal;

import com.zellpayment.entity.Transactions;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class TransactionLogsTO {
    private Long logId;

    private Transactions transaction;

    private String message;

    private LocalDateTime createdAt;
}
