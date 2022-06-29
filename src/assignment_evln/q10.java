 package assignment_evln;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
public class q10 { 	 
	private int emp_id; 
	private String emp_domain; 	
	private Float salary; 	
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_domain() {
		return emp_domain;
	}
	public void setEmp_domain(String emp_domain) {
		this.emp_domain = emp_domain;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public q10(int emp_id, String emp_domain, Float salary)
	{ 		
		super(); 		
		this.emp_id = emp_id; 
		this.emp_domain = emp_domain; 	
		this.salary = salary; 
		}
	@Override 	
	public String toString() { 	
		return "lambClass [emp_id=" + emp_id + ", emp_domain=" + emp_domain + ", salary=" + salary + "]"; 	
	} 
	public static void main(String[] args) { 	
		List<q10> el= new ArrayList<q10>(); 		
		el.add(new q10(101,"develpoer",30000.0f)); 		
		el.add(new q10(102,"tester",92529.5f)); 		
		el.add(new q10(103,"supprt",200000.0f)); 	
		el.add(new q10(104,"manager",50000.0f)); 	
		el.add(new q10(105,"Tecaller",80276.0f));  	
		el.add(new q10(201, "cleaner",15000.f ));
		el.add(new q10(202, "plumber",20000.f ));
		el.add(new q10(203, "watchemen",25000.f ));
		el.add(new q10(204, "electrician",22000.f ));
		el.add(new q10(205, "mechanic",17000.f ));
		el.stream().filter(e->e.salary<10000).forEach(e->System.out.println("employees whose salary is less than 10000 :"+e));  	
		 
		//converted into set
		Set<q10> st= el.stream().collect(Collectors.toSet());
		System.out.println(st);
		
		List<q10> t= (List<q10>) el.stream().collect(Collectors.toList());
		System.out.println(t);

		//converted into map
		Map<Integer, String> map = el.stream()
                .collect(Collectors.toMap(q10::getEmp_id,q10::getEmp_domain));
		System.out.println(map);
	
	} 
	}     