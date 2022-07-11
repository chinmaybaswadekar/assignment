package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_5Test {
	public static void main(String[] args) {
		ApplicationContext objx = new ClassPathXmlApplicationContext("bean.xml");
		 Question_5 obj1 = (Question_5) objx.getBean("q5");
		 obj1.method(new int[] { 2, 6, 4, 6, 3, 22, 4, 5, 3, 3, 45 });
}
}