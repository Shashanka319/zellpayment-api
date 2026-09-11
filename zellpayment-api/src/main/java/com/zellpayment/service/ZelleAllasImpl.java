package com.zellpayment.service;

import com.zellpayment.repository.ZelleAllasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZelleAllasImpl implements ZelleAllasService {
    @Autowired
    private ZelleAllasRepository zelleAllasRepository;
}
