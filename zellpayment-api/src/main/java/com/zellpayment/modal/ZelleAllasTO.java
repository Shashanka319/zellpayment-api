package com.zellpayment.modal;

import com.zellpayment.entity.BankAccounts;
import com.zellpayment.entity.Users;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ZelleAllasTO {
    private Long aliasId;

    private Users user;

    private BankAccounts bankAccount;

    private String type;

    private String value;

    private LocalDateTime createdAt;
}
