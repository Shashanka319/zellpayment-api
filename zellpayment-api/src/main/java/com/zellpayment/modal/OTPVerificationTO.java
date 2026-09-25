package com.zellpayment.modal;

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
public class OTPVerificationTO {
    private Long otpId;

    private Users user;

    private String otpCode;

    private String purpose;

    private LocalDateTime expiresAt;

    private Integer verified;

    private LocalDateTime createdAt;
}
