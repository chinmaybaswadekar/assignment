package spring_evln_a;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Question_11Test {
	public static void main(String[] args) {
		List<Question_11_stduent> slist = new ArrayList<Question_11_stduent>();
		ApplicationContext ob = new ClassPathXmlApplicationContext("bean.xml");
		Question_11_stduent e1 = (Question_11_stduent) ob.getBean("qu11b");
		Question_11_stduent e2 = (Question_11_stduent) ob.getBean("qu11d");

		slist.add(e1);
		slist.add(e2);
		for(Question_11_stduent s :slist) {
			System.out.println(s.studentname+" "+s.res.total_marks);
			
		}
		System.out.println("On the basis of total marks");
		List<Question_11_stduent> sortedlist = slist.stream().sorted((s1, s2) -> Double.compare(s1.res.total_marks, s2.res.total_marks)).collect(Collectors.toList());
		for (Question_11_stduent w : sortedlist) {
		System.out.println(w.res.total_marks);
	}
	}
	}

