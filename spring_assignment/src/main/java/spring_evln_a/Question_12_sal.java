package spring_evln_a;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_12_sal {


public static void main(String[] args) {

	List<Question_12_employee> slist = new ArrayList<Question_12_employee>();

	ApplicationContext cob = new ClassPathXmlApplicationContext("bean2.xml");

	Question_12_employee ct1 = (Question_12_employee) cob.getBean("que12a");
	Question_12_employee ct2 = (Question_12_employee) cob.getBean("que12b");
	Question_12_employee ct3 = (Question_12_employee) cob.getBean("que12c");
	Question_12_employee ct4 = (Question_12_employee) cob.getBean("que12d");
	slist.add(ct1);
	slist.add(ct2);

	slist.add(ct3);
	slist.add(ct4);

	Question_12_employee max = slist.stream().max((e1, e2) -> e1.salary > e2.salary ? 1 : -1).get();

	System.out.println(max.toString());
	System.out.println("===========================================");
	Double avg = slist.stream().collect(Collectors.averagingDouble(e -> e.salary));
      System.out.println("Average number is"+avg);
      List<Question_12_employee> minimumavg= slist.stream().filter(i->i.salary< avg).collect(Collectors.toList());

      for(Question_12_employee a:minimumavg) {
      	
      	System.out.println(a.ename+" "+a.salary);
      }
      System.out.println("============================");
      List<String > department=slist.stream().map(r->r.dept).distinct().collect(Collectors.toList());
  	for(String d:department) {
  		Double avg1=slist.stream().filter(e->e.dept.equals(d)).collect(Collectors.averagingDouble(e->e.salary));
  	System.out.println("Avarage Salary = "+avg1+" = Department = "+d);
  	
  	}

}
}