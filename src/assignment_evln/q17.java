package assignment_evln;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class q17 {

	
//	User will enter employee detail like emp name, date of birth , date of joining, date of resign, 
//	work location, department, salary. Now we will check following details
	
	String emp_name;
	LocalDate dob;
	LocalDate doj;
	LocalDate dor;
	String work_location;
	String dept;
	float salary;
	
	public q17(String emp_name, LocalDate dob, LocalDate doj, LocalDate dor, String work_location,
			String dept, float salary) {
		super();
		this.emp_name = emp_name;
		this.dob = dob;
		this.doj = doj;
		this.dor = dor;
		this.work_location = work_location;
		this.dept = dept;
		this.salary = salary;
		
		
	}
	

	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	public LocalDate getDor() {
		return dor;
	}


	public void setDor(LocalDate dor) {
		this.dor = dor;
	}


	public String getWork_location() {
		return work_location;
	}


	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "employee_details [emp_name=" + emp_name + ", dob=" + dob + ", doj=" + doj + ", dor=" + dor
				+ ", work_location=" + work_location + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		
		List<q17> el=new ArrayList<q17>();
		
   el.add(new q17("vineet kumar", LocalDate.of(1998, 10, 5), LocalDate.of(2020, 5, 10), LocalDate.of(2022, 7, 19), "pune-magarpatta", "facilities", 35000.0f));
   el.add(new q17("ashish agarwal", LocalDate.of(1989, 11,12), LocalDate.of(2021, 7, 12), LocalDate.of(2022, 9, 19), "pune-magarpatta", "facilities", 38000.0f));
   el.add(new q17("shubham reddy", LocalDate.of(1995, 8, 15), LocalDate.of(2016, 4, 10), LocalDate.of(2020, 4, 14), "pune-hinjawadi", "support", 40000.0f));
   el.add(new q17("ram more", LocalDate.of(1993, 6, 12), LocalDate.of(2011, 4, 14), LocalDate.of(2015, 6, 21), "pune-hinjawadi", "support", 39000.0f));
   el.add(new q17("gopal soni", LocalDate.of(1997, 3, 12), LocalDate.of(2021, 8, 14), LocalDate.of(2022, 9,8), "mumbai", "testing", 37000.0f));
   el.add(new q17("abhinet gupta", LocalDate.of(1994, 3, 16), LocalDate.of(2012, 8, 14), LocalDate.of(2017, 4, 8), "mumbai", "testing", 31000.0f));
   el.add(new q17("pratik salgar", LocalDate.of(1999, 5, 6), LocalDate.of(2018, 9, 17), LocalDate.of(2019, 6, 13), "noida", "developement", 45000.0f));
   el.add(new q17("ajay mohite", LocalDate.of(1991, 8, 9), LocalDate.of(2018, 2, 11), LocalDate.of(2022, 1, 18), "noida", "developement", 42000.0f));
   el.add(new q17("kapil biradar", LocalDate.of(1988, 1, 5), LocalDate.of(2009, 10, 29), LocalDate.of(2015, 8, 19), "goa", "HR", 50000.0f));
   el.add(new q17("rushikesh narhare", LocalDate.of(2000, 7, 15), LocalDate.of(2021, 6, 27), LocalDate.of(2022, 3, 11), "goa", "HR", 30000.0f));
   el.add(new q17("vishnu potdar", LocalDate.of(1999, 6, 14), LocalDate.of(2019, 6, 27), LocalDate.of(2021, 3, 11), "goa", "HR", 32000.0f));
   el.add(new q17("shubham gaware", LocalDate.of(1991, 6, 14), LocalDate.of(2019, 6, 27), LocalDate.of(2021, 3, 11), "chennai", "cyber security", 60000.0f));
   
   //employees in particular department
	Map<String,String> mp=el.stream().collect(Collectors.toMap(p->p.emp_name,p->p.dept));
	System.out.println("Employees as per department : " +mp);
	 
  long count = el.stream().filter(x -> x.dept.contains("f")).count();
  System.out.println(count);
   
  //average salary as per department
  Set<String> det=el.stream().map(n->n.dept).collect(Collectors.toSet());  
  
  for(String dpt:det)
  {
	  Double avgsal=el.stream().filter(e->e.dept.equals(dpt)).collect(Collectors.averagingDouble(e->e.salary));
	  System.out.println("department is " +dpt + " " + " average salary is " + avgsal);
	  
	  
  }
  
  
  System.out.println("-------------------------------------------------------------------------");
  //maximum salary in each department
  for(String dpt:det) {
  Float maxsal=el.stream().filter(e->e.dept.equals(dpt)).map(e->e.salary).max((e1,e2)->e1>e2?1:-1).get();
      System.out.println("maximum salary in each department is : " +dpt + " " + maxsal);
  }
  System.out.println("-------------------------------------------------------------------------");

  //minimum salary in each department
  for(String dpt:det) {
	  Float minsal=el.stream().filter(e->e.dept.equals(dpt)).map(e->e.salary).min((e1,e2)->e1<e2?-1:1).get();
	      System.out.println("minimum salary in each department is : " +dpt + " " + minsal);
  }

  System.out.println("-------------------------------------------------------------------------");

  
 Optional<q17> maxex=el.stream().sorted(Comparator.comparing(q17::getDoj)).findFirst();
 q17 emp=maxex.get();
 System.out.println("maximum employee in any department "+emp.getDept());
 
 

 DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
 LocalDateTime now=LocalDateTime.now();
 System.out.println("current date --" +df.format(now));
 System.out.println("current month--"+df.format(now));
 System.out.println("current year"+df.format(now));
 
 
 
 System.out.println("-------------------------------------------------------------------------");

 //upcoming birthdays and job anniversaries
 LocalDate currentdate=LocalDate.now();
 Set<q17> ja=el.stream().filter(e->e.dob.getDayOfMonth()<=currentdate.getDayOfMonth()).collect(Collectors.toSet());

 for(q17 e:ja) {
 System.out.println("birthday of " + e.emp_name + " date of birth is " + e.dob); }
	
 
 Set<q17> jb=el.stream().filter(e->e.doj.getDayOfMonth()<=currentdate.getDayOfMonth()).collect(Collectors.toSet());

 System.out.println("-------------------------------------------------------------------------");

 for(q17 e:ja) {
 System.out.println(" Anniversary of  " + e.emp_name + " anniversary date is  " + e.doj); }
	
 System.out.println("-------------------------------------------------------------------------");

 //total experience of each employee
for(q17 e:el) {
int exp=Period.between(e.doj, e.dor).getYears();
System.out.println(e.emp_name + " - experince " +exp +  "years");
}

System.out.println("-------------------------------------------------------------------------");

Set<q17> ua=el.stream().filter(e->e.doj.getDayOfMonth()<=currentdate.getDayOfMonth()).collect(Collectors.toSet());




}}

 