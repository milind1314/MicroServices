package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class BootCloudMsProj02EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudMsProj02EurekaServerApplication.class, args);
	}

}
