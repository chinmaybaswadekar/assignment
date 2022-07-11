package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Quest_15Test {
public static void main(String[] args) {
	ApplicationContext ob= new ClassPathXmlApplicationContext("bean.xml");
	customer cts=ob.getBean("CustID",customer.class);
	cts.display();
			
}
}
