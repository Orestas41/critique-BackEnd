package com.example.tsi.orestas.dulinskas.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SakilaDatabaseApplicationTests {

	@Test
	void contextLoads() {
	}

	public void test_IsEmpty(){
		SakilaDatabaseApplication testIsEmpty = new SakilaDatabaseApplication();
		testIsEmpty.isEmpty();
		assertEquals(false, testIsEmpty.isEmpty(),"wrong");
	}

}
