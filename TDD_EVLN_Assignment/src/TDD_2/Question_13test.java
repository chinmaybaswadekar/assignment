package TDD_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Question_13test {

	@Test
	void test1() {
		assertEquals(10, Question_13.ad(5, 5));;
	}
  
	@Test
	void test2() {
		assertEquals(0, Question_13.sub(5, 5));;
	}
	
	@Test
	void test3() {
		assertEquals(25, Question_13.mul(5, 5));;
	}
	
	@Test
	void test4() {
		assertEquals(true, Question_13.div(5, 5));;
	}
	
	@Test
	void test5() {
		assertEquals(true, Question_13.mod(5, 5));;
	}
	
	@Test
	void test6() throws Exception {
		assertEquals(5, Question_13.po(125));;
	}
	
	@Test
	void test7() throws Exception {
		assertEquals(12, Question_13.sqr(144));;
	}
}
