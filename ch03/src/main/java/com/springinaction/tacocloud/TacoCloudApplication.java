package com.springinaction.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
<<<<<<< Updated upstream
@ComponentScan(basePackages = {"controller", "repository"})
public class TacoCloudApplication {
=======
@ComponentScan(basePackages = {"controller", "security"})
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "domain")
public class TacoCloudApplication  {
>>>>>>> Stashed changes

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
