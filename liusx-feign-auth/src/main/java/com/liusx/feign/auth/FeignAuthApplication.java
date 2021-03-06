package com.liusx.feign.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignAuthApplication.class, args);
	}
}
