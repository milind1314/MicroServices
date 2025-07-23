package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BootCloudMsProj03CartMsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudMsProj03CartMsConsumerApplication.class, args);
	}

}
