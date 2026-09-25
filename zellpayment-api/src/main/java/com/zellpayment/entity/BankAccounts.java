package com.zellpayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank_accounts")
@Getter
@Setter
@NoArgsConstructor
public class BankAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accId")
    @SequenceGenerator(name = "accId", sequenceName = "seq_bank_accounts", allocationSize = 1)
    @Column(name = "account_id")
    private Long accId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

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

    @OneToMany(mappedBy = "bankAccount")
    private List<ZelleAllas> aliases = new ArrayList<>();
}