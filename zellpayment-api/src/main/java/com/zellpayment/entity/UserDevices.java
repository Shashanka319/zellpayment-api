package com.zellpayment.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_devices")
public class UserDevices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "id")
    @SequenceGenerator(name = "id",sequenceName = "seq_user_devices",allocationSize = 1)
    @Column(name = "device_id")
    private Integer id;
    @Column(name = "user_id")
    private Integer user_id;
    @Column(name = "device_type")
    private String deviceType;
    @Column(name = "device_token")
    private String deviceToken;
    @Column(name = "last_login")
    private LocalDateTime lastLogin;
}
