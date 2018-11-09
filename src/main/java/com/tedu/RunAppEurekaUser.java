package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //表示EurekaServer
public class RunAppEurekaUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(RunAppEurekaUser.class, args);
	}

}
