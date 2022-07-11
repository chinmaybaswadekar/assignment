package spring_evln_a;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_14Test {
public static void main(String[] args) {
	ApplicationContext cb=new ClassPathXmlApplicationContext("bean.xml");
Quest_14_circle qe=(Quest_14_circle) cb.getBean("ar");
	
	
	Quetsion_14_rect re=(Quetsion_14_rect) cb.getBean("ra");
	
	
	Question_14_square sq=(Question_14_square) cb.getBean("sa");
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the object :");
	sc=new Scanner(System.in);
	String no=sc.nextLine();
	
	switch (no) {
	case "qe":
		qe.area();
		qe.sides();
		break;
	case "re":
		re.area();
		re.sides();
		break;
	case "sq":
		sq.area();
		sq.sides();
		break;
		default: System.out.println("Enter valid");
	}
}
}
