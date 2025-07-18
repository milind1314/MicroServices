package com.mi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class BootCloudMsProj01EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootCloudMsProj01EurekaServerApplication.class, args);
	}

}
