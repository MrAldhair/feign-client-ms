package com.feignclient.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // Se indica a Spring que se va a utilizar Feign dentro del contexto
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
