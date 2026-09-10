package com.zellpayment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ZellpaymentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZellpaymentApiApplication.class, args);
		log.info("ZellpaymentApiApplication started");
	}

}
