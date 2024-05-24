package com.example.Lotto_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class LottoProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(LottoProjectApplication.class, args);
	}

}
