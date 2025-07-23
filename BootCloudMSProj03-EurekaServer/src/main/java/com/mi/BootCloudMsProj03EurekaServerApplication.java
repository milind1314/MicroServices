package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootCloudMsProj03EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudMsProj03EurekaServerApplication.class, args);
	}

}
