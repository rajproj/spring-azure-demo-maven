package com.manojava.springazuredemomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoMavenApplication {
	@GetMapping("/message")
	public String getMessage(){
		return "Welcome to spring boot app on azure......";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoMavenApplication.class, args);
	}

}
