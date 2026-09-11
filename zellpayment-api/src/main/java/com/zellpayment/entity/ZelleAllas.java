package com.zellpayment.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "zelle_alias")
public class ZelleAllas {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id")
    @SequenceGenerator(name = "id",sequenceName ="seq_zelle_alias",allocationSize = 1)
    @Column(name = "alias_id")
    private Integer aliasId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "alias_type")
    private String type;
    @Column(name = "alias_value")
    private String value;
    @Column(name = "account_id")
    private Long  accId;
    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
