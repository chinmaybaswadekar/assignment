package spring_evln_a;


import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Question_2test {
public static class test{
	public static void main(String[] args) {
		ApplicationContext cx=new ClassPathXmlApplicationContext("bean.xml");		
		Question_2 qu =(Question_2) cx.getBean("ibean");
		
		qu.sum();

}
}
}
