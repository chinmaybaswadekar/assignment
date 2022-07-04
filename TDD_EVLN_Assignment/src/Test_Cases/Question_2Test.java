package Test_Cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import TDD_2.Question_2;

class Question_2Test {

	@Test
	void test() {
		assertEquals(false, Question_2.palindrome("abbaaa", "abba"));
	}

}
