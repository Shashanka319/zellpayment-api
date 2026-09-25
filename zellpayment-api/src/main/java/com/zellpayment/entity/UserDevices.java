package com.zellpayment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_devices")
@Getter
@Setter
@NoArgsConstructor
public class UserDevices {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "devId")
    @SequenceGenerator(name = "devId", sequenceName = "seq_user_devices", allocationSize = 1)
    @Column(name = "device_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Users user;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_token")
    private String deviceToken;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;
}