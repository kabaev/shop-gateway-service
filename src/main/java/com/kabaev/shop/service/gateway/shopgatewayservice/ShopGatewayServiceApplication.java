package com.kabaev.shop.service.gateway.shopgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = ReactiveUserDetailsServiceAutoConfiguration.class)
public class ShopGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopGatewayServiceApplication.class, args);
	}

}
