package Test_Cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TDD_2.Question_1;


class Question_1Test {

	@Test
	void test() {
		assertEquals(14,Question_1.hcf(60, 75));
	}

}
