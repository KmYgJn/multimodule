package dev.be.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (
		scanBasePackages = { "dev.be.api", "dev.be.common"}
)
@EntityScan("dev.be.common.domain")
@EnableJpaRepositories(basePackages = "dev.be.common.repository")
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
