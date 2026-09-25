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
public class UserDevicesTO {
    private Long id;

    private Users user;

    private String deviceType;

    private String deviceToken;

    private LocalDateTime lastLogin;
}
