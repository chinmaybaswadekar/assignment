package TDD_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import TDD_2.singleton_q11;


class Qyestion_11Test {

	@Test
	void test() {
		question11 st1=question11.gesingleton();
		question11 st2=question11.gesingleton();

		equals(singleton_q11.check(st1,st2));

		
	}

}
