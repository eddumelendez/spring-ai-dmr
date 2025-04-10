package com.example.spring_ai_dmr;

import org.springframework.boot.SpringApplication;

public class TestSpringAiDmrApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAiDmrApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
