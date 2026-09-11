package com.zellpayment.repository;

import com.zellpayment.entity.OTPVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OTPVerificationRepository extends JpaRepository<OTPVerification, Integer> {
}
