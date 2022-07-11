package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_13Test {
	public static void main(String[] args) {
		
		ApplicationContext obj = new ClassPathXmlApplicationContext("bean2.xml");
		Question_13 i1=(Question_13) obj.getBean("CustID");
		i1.show();
}
}