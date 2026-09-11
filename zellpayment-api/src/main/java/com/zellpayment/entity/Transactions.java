package com.zellpayment.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "txnId")
    @SequenceGenerator(name = "txnId",sequenceName = "seq_transactions",allocationSize = 1)
    @Column(name = "transaction_id")
    private Long transactionId;
    @Column(name = "sender_user_id")
    private Integer senderId;
    @Column(name = "receiver_user_id")
    private Integer receiverId;
    @Column(name = "sender_account_id")
    private Long senderAccountId;
    @Column(name = "receiver_account_id")
    private Long receiverAccountId;
    @Column(name = "amount")
    private double amount;
    @Column(name = "currency")
    private String currency;
    @Column(name = "status")
    private String status;
    @Column(name = "reference_note")
    private String refNote;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "completed_at")
    private LocalDateTime completedAt;



}
