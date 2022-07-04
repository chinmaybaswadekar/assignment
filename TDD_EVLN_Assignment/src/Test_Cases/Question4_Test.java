package Test_Cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TDD_2.Question_4;

class Question4_Test {

	@Test
	void test() {
		assertEquals(true, Question_4.armstrong(371));
	}

}
