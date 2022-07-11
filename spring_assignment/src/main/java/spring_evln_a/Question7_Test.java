package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question7_Test {
	public static class test{
		public static void main(String[] args) {
			ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");		
			Question_7class2 qu =(Question_7class2) ctx.getBean("a2");
			
		}}
			
			
}
