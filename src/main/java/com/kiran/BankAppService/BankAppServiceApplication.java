package com.kiran.BankAppService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class BankAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppServiceApplication.class, args);
	}

}
