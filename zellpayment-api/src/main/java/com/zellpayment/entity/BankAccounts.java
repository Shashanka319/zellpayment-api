package com.zellpayment.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "bank_accounts")
public class BankAccounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "accId")
    @SequenceGenerator(name ="accId",sequenceName = "seq_bank_accounts",allocationSize = 1)
    @Column(name = "account_id")
    private Long accId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "bank_name")
    private String bankName;
    @Column(name = "account_number")
    private String accNo;
    @Column(name = "ifsc_code")
    private String ifscCode;
    @Column(name = "is_primary")
    private Integer isPrimary;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
