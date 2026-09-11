package com.zellpayment.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_logs")
public class TransactionLogs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "logId")
    @SequenceGenerator(name = "logId",sequenceName = "seq_transaction_logs",allocationSize = 1)
    @Column(name = "log_id")
    private Long logId;
    @Column(name = "transaction_id")
    private Long transactionId;
    @Column(name = "message")
    private String message;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
