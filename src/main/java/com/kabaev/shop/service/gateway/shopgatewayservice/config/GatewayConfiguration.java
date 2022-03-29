package com.kabaev.shop.service.gateway.shopgatewayservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    private String keeperServiceBaseUrl;
    private String customerServiceBaseUrl;

    public GatewayConfiguration(
            @Value("${keeper.service.baseurl}") String keeperServiceBaseUrl,
            @Value("${customer.service.baseurl}") String customerServiceBaseUrl) {
        this.keeperServiceBaseUrl = keeperServiceBaseUrl;
        this.customerServiceBaseUrl = customerServiceBaseUrl;
    }

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/api/v1/products/**").uri(keeperServiceBaseUrl))
                .route(r -> r.path("/api/v1/search/products/**").uri(customerServiceBaseUrl))
                .build();
    }

}
