package com.zellpayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_limits")
@Getter
@Setter
@NoArgsConstructor
public class TransactionLimits {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "limitId")
    @SequenceGenerator(name = "limitId", sequenceName = "seq_transaction_limits", allocationSize = 1)
    @Column(name = "limit_id")
    private Long limitId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(name = "daily_limit", precision = 12, scale = 2)
    private BigDecimal dailyLimit;

    @Column(name = "per_txn_limit", precision = 12, scale = 2)
    private BigDecimal perTxnLimit;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}