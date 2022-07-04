package Test_Cases;

import static org.junit.jupiter.api.Assertions.*;

import javax.print.attribute.standard.MediaSize.NA;

import org.junit.jupiter.api.Test;

import TDD_2.Question_10;

class Question_10Test {


	@Test
	void test() {

assertEquals("apple-orange-mango-banana", Question_10.con( new String[]{"apple","orange","mango","banana"}));

	
	}
}