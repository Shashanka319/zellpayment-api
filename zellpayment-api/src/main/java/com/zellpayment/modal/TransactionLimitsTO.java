package com.zellpayment.modal;

import com.zellpayment.entity.Users;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
public class TransactionLimitsTO {
    private Long limitId;

    private Users user;

    private BigDecimal dailyLimit;

    private BigDecimal perTxnLimit;

    private LocalDateTime updatedAt;
}
