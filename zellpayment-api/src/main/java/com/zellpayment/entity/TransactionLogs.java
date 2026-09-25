package com.zellpayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_logs")
@Getter
@Setter
@NoArgsConstructor
public class TransactionLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "logId")
    @SequenceGenerator(name = "logId", sequenceName = "seq_transaction_logs", allocationSize = 1)
    @Column(name = "log_id")
    private Long logId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transaction_id", nullable = false)
    private Transactions transaction;

    @Column(name = "message")
    private String message;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}