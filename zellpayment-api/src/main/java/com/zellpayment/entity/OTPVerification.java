package com.zellpayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "otp_verifications")
@Getter
@Setter
@NoArgsConstructor
public class OTPVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "otp_id")
    @SequenceGenerator(name = "otp_id", sequenceName = "seq_otp_verifications", allocationSize = 1)
    @Column(name = "otp_id")
    private Long otpId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(name = "otp_code")
    private String otpCode;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    @Column(name = "verified")
    private Integer verified;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}