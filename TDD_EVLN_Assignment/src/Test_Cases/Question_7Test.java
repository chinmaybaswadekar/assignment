package Test_Cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TDD_2.Question_7;

class Question_7Test {

	@Test
	void test() {
		assertEquals(true, Question_7.palindrome_number(353));
	}

}
