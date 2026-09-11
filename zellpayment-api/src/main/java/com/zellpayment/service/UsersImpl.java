package com.zellpayment.service;

import com.zellpayment.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
}
