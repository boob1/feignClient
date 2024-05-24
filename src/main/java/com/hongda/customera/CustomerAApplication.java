package com.hongda.customera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerAApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerAApplication.class, args);
        System.out.println("customerA启动成功................");
    }

}
