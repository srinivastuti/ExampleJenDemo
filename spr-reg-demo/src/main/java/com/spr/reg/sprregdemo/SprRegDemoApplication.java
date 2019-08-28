package com.spr.reg.sprregdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SprRegDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprRegDemoApplication.class, args);
	}

}
