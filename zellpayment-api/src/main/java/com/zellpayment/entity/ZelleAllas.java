package com.zellpayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "zelle_alias")
@Getter
@Setter
@NoArgsConstructor
public class ZelleAllas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aliasId")
    @SequenceGenerator(name = "aliasId", sequenceName = "seq_zelle_alias", allocationSize = 1)
    @Column(name = "alias_id")
    private Long aliasId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private BankAccounts bankAccount;

    @Column(name = "alias_type")
    private String type;

    @Column(name = "alias_value")
    private String value;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}