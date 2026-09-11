package com.zellpayment.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_limits")
public class TransactionLimits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
    @SequenceGenerator(name = "id",sequenceName =  "seq_transaction_limits",allocationSize = 1)
    @Column(name = "limit_id")
    private Long limitId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "daily_limit")
    private Integer dailyLimit;
    @Column(name = "per_txn_limit")
    private Integer perTxnLimit;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
