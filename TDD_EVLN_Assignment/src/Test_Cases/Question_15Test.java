package Test_Cases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import TDD_2.Question_15;

class Question_15Test {
	Question_15 qu=new Question_15();
	Scanner sc=new Scanner(System.in);


	@Test
	void test1() {
		System.out.println("enter itemid :");
		int i=sc.nextInt();
		assertEquals(true, qu.check(i));
	}

	@Test
	void test2() {
		System.out.println("enter item name :");
		String str=sc.next();
		assertEquals(true, qu.al(str));
	}


	@Test
	void test3() {
		System.out.println("enter cost price :");
		int i=sc.nextInt();
		assertEquals(true, qu.contain(i));
	}


	@Test
	void test4() {
		System.out.println("enter date of expiry :");
		String Date_Format="yyyy-MM-dd";
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern(Date_Format);
		String dt=sc.nextLine();
		LocalDate md=LocalDate.parse(dt,formatter);
		assertEquals(true,qu.doecheck(md));
	}
	
	@Test
	void test5() {
		System.out.println("enter cost price :");
		int cp=sc.nextInt();
		System.out.println("enter sell price :");
		int sp=sc.nextInt();
		assertEquals(true, qu.same(cp,sp));
	}

}
