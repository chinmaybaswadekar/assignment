package Test_Cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TDD_2.Question_3;

class Question_3Test {

	@Test
	void test() throws Exception {
		assertEquals(true, Question_3.checkuser("chinmay@yash.com", "chinmay"));
	}

}
