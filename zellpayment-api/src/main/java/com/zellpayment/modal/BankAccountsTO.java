package com.zellpayment.modal;

import com.zellpayment.entity.Users;
import com.zellpayment.entity.ZelleAllas;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
public class BankAccountsTO {
    private Long accId;

    private Users user;

    private String bankName;

    private String accNo;

    private String ifscCode;

    private Integer isPrimary;

    private LocalDateTime createdAt;

    private List<ZelleAllas> aliases;
}
