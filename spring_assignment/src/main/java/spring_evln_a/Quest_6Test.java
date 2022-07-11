package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Quest_6Test {
	public static void main(String[] args) {
		ApplicationContext objCT = new ClassPathXmlApplicationContext("bean.xml");
		 Quest_6 obj1 = ( Quest_6) objCT.getBean("que");
		 obj1.result();
		
}
}