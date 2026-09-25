package com.zellpayment.modal;

import com.zellpayment.entity.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UsersTO {
    private Long userId;

    private String userName;

    private String userEmail;

    private String userPhoneNo;

    private String password;

    private LocalDateTime createdAt;

    private String status;

    private List<OTPVerification> otpVerifications;

    private List<UserDevices> userDevices;

    private List<BankAccounts> bankAccounts;

    private List<TransactionLimits> transactionLimits;

    private List<ZelleAllas> zelleAliases;
}
