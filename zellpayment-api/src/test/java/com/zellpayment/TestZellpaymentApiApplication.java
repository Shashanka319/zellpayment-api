package com.zellpayment;

import org.springframework.boot.SpringApplication;

public class TestZellpaymentApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(ZellpaymentApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
