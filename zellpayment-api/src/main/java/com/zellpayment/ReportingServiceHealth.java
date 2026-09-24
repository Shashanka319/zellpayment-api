package com.zellpayment;

import lombok.Setter;
import org.jspecify.annotations.Nullable;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Service;

@Service
public class ReportingServiceHealth implements HealthIndicator {
    @Override
    public @Nullable Health health() {
        boolean isHealthy = checkReportingServiceHealth();
        if(isHealthy) {
            return Health.up().withDetail("Reporting Service", "Available").build();
        }else{
            return Health.down().withDetail("Reporting Service", "Unavailable").build();
        }
    }
    private boolean checkReportingServiceHealth() {
        return false;
    }
}
