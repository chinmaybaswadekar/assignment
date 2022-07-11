package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_1Test {
	
		public static void main(String[] args) {
			ApplicationContext obj = new ClassPathXmlApplicationContext("bean.xml");
			
			Question_1 o1=(Question_1) obj.getBean("que1");
			o1.show();
}
}