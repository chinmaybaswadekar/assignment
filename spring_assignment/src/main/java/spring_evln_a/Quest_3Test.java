package spring_evln_a;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Quest_3Test {
	public static void main(String[] args) {
		ApplicationContext obj=new ClassPathXmlApplicationContext("bean.xml");
		Quest_3 obj1=(Quest_3) obj.getBean("ib");
		System.out.println("interset rate " +obj1.rate +"%");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount ");
		float amount=sc.nextFloat();
		
		System.out.println("enter validity in years :");
		int validity=sc.nextInt();
		int validityintmonth=validity*12;
		
		double TPA=amount +((amount*obj1.rate)/100)*validity;
		System.out.println("ttal payable amount :" +TPA);
		
		double emi=TPA/validityintmonth;
		System.out.println("emi :" +emi);
	}
}
