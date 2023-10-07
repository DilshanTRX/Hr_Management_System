package com.hr_api.Hr_Management_System;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class HrManagementSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(HrManagementSystemApplication.class, args);
	}
}
