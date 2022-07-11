package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Q4Test {
public static void main(String[] args) {
	
	ApplicationContext ct=new ClassPathXmlApplicationContext("bean.xml");
	Question_4Employee em= ct.getBean("ap",Question_4Employee.class);
	em.getemp();
}
}
