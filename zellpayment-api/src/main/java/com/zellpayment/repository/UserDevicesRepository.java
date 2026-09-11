package com.zellpayment.repository;

import com.zellpayment.entity.UserDevices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDevicesRepository extends JpaRepository<UserDevices, Integer> {
}
