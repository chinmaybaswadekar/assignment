package spring_evln_a;
import javax.annotation.*;

//WAP in spring core to read the data using post_construct annotated method by user and
//perform calculation of average of numbers.

public class Question_2 {

	int no1;
	int no2;
	int no3;
	int no4;
	int no5;
	int no6;

//	public Question_2(int no1, int no2, int no3, int no4, int no5, int no6) {
//		super();
//		this.no1 = no1;
//		this.no2 = no2;
//		this.no3 = no3;
//		this.no4 = no4;
//		this.no5 = no5;
//		this.no6 = no6;
//	}
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public int getNo2() {
		return no2;
	}
	public void setNo2(int no2) {
		this.no2 = no2;
	}
	public int getNo3() {
		return no3;
	}
	public void setNo3(int no3) {
		this.no3 = no3;
	}
	public int getNo4() {
		return no4;
	}
	public void setNo4(int no4) {
		this.no4 = no4;
	}
	public int getNo5() {
		return no5;
	}
	public void setNo5(int no5) {
		this.no5 = no5;
	}
	public int getNo6() {
		return no6;
	}
	public void setNo6(int no6) {
		this.no6 = no6;
	}
	
	


public void sum() {
	
int avg=(no1+no2+no3+no4+no5+no6)/6;
	System.out.println("avg of no's are :" +avg);
	
}

@PostConstruct
public void sum2() {

	Question_2 q2=new Question_2();
	q2.sum();
}
}
