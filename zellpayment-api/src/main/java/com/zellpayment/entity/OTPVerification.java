package com.zellpayment.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "otp_verifications")
public class OTPVerification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "otp_id")
    @SequenceGenerator(name = "otp_id",sequenceName = "seq_otp_verifications",allocationSize = 1)
    @Column(name = "otp_id")
    private Integer otpId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "otp_code")
    private String otpCode;
    @Column(name = "purpose")
    private String purpose;
    @Column(name = "expires_at")
    private LocalDate expires;
    @Column(name = "verified")
    private Integer verified;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
