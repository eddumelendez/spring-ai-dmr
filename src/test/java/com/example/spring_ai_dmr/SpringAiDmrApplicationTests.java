package com.example.spring_ai_dmr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringAiDmrApplicationTests {

	@Test
	void contextLoads() {
	}

}
