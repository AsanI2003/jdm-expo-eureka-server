package com.jdm.jdm_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JdmEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdmEurekaServerApplication.class, args);
	}

}
