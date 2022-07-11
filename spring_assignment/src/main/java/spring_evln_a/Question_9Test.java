package spring_evln_a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_9Test {
public static void main(String[] args) {
	
	ApplicationContext obj = new ClassPathXmlApplicationContext("bean2.xml");

	List<Question_9> el=new ArrayList<Question_9>();
	Question_9 ns=(Question_9)  obj.getBean("ok");
	el.add(ns);
	
	Question_9 ss=(Question_9)  obj.getBean("pp");
	el.add(ss);

	Question_9 ms=(Question_9)  obj.getBean("rr");
	el.add(ms);

	Scanner sc=new Scanner(System.in);
	System.out.println("enter startign city name :");
	String ct=sc.nextLine();
	
	System.out.println("enter ending city name :");
	String ct2=sc.nextLine();

	Set<Float>cn=el.stream().filter(e->e.starting_city.startsWith(ct) && e.ending_city.startsWith(ct2)).map(n->n.distance  ).collect(Collectors.toSet());

System.out.println("distance between these two cities are :" +cn);
	
}
}
