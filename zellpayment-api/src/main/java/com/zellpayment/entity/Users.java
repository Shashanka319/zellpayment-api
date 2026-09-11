package com.zellpayment.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq")
    @SequenceGenerator(name = "user_seq",sequenceName = "seq_users",allocationSize=1)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "full_name")
    private String userName;
    @Column(name = "email")
    private String userEmail;
    @Column(name = "phone_number")
    private String userPhoneNo;
    @Column(name = "password_hash")
    private  String password;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "status")
    private String status;
}
