package com.kabaev.shop.service.gateway.shopgatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/v1/products/**").uri("http://localhost:8080"))
                .route(r -> r.path("/api/v1/search/products/**").uri("http://localhost:8081"))
                .build();
    }

}
