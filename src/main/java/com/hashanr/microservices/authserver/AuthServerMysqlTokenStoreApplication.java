package com.hashanr.microservices.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class AuthServerMysqlTokenStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerMysqlTokenStoreApplication.class, args);
	}

}
