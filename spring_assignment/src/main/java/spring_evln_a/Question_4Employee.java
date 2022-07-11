package spring_evln_a;
/*WAP to perform demonstrate autowire. Use Two classes, first class Employee, second 
department now store all employee and department details. Print employee details in order 
by employee salary */

public class Question_4Employee {
	int id;  
	 String name;  
	 
	 departmentQ4 dp;
	
	 
	 public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public departmentQ4 getDp() {
		return dp;
	}


	public void setDp(departmentQ4 dp) {
		this.dp = dp;
	}


	public void getemp(){
		 System.out.println(" emp id is : " +id);
		 System.out.println("emp name is : "+name);
		 System.out.println("emp salary is : " +dp.getSal());
	 }
}
  
