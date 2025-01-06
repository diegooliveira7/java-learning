package com.test.test_spring_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication //essa anotação é abstração de várias outras anotações e configurações
@Profile("dev")
public class TestSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringAppApplication.class, args);
	}

}
