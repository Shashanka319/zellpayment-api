package com.zellpayment.service;

import com.zellpayment.repository.OTPVerificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OTPVerificationImpl implements OTPVerificationService{
    @Autowired
    private OTPVerificationRepository otpVerificationRepository;
}
