package spring_evln_a;

public class Question_5_class2 implements Question_5{
	
public void method (int [ ] a) {
	int max=a[0];
	for (int c:a) {
		if (c>max) {
			max=c;
		}
		System.out.println("max number is :" +max);
	}
}
}
