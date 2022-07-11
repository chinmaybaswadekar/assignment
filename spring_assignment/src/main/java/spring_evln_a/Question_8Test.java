package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_8Test {
	public static void main(String[] args) {
		ApplicationContext obj = new ClassPathXmlApplicationContext("bean2.xml");
		Question_8 i1=(Question_8) obj.getBean("que8");
		i1.show();
		System.out.println("============");
		i1.ascending();
		System.out.println("===========");
		i1.descending();
		System.out.println("================");
		i1.removeduplicate();
}}
