package spring_evln_a;

public class Question_12_employee {


String ename;
int salary;
String dept;



public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
}



}
