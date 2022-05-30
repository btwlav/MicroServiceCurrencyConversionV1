package com.micro.service.currency.conversion.v1.microservicecurrencyconversionv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MicroServiceCurrencyConversionV1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCurrencyConversionV1Application.class, args);
    }

}
