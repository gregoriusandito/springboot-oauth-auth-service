package com.onlinetest.oauthauthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class OauthauthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthauthorizationApplication.class, args);
	}

}
