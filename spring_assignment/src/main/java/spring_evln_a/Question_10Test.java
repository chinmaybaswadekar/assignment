package spring_evln_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_10Test {
	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Question_10_student student = (Question_10_student) context.getBean("que10");

    

    student.getStd();
}
}