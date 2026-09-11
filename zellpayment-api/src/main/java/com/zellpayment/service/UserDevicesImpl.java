package com.zellpayment.service;

import com.zellpayment.repository.UserDevicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDevicesImpl implements UserDevicesService {
    @Autowired
    private UserDevicesRepository userDevicesRepository;
}
