package com.revature.Project2BackEnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.revature")
@EntityScan("com.revature.models")
@EnableJpaRepositories("com.revature.repositories")
public class Project2BackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project2BackEndApplication.class, args);
	}

}
