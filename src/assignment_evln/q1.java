package assignment_evln;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

public class q1 {

	public static Scanner scanner;
	
	public static void main(String[] args) {
		System.out.println("Enter the marks that you use to calculate avg ");
		
		
		scanner =new Scanner(System.in);
		int no=scanner.nextInt();
		
		int [] a= new int [no];
		
		for(int i=0;i<no;i++) {
			
			System.out.println("enter the marks");
			a[i]=scanner.nextInt();
		}
		IntStream streamOfmarks=Arrays.stream(a);
		OptionalDouble avgmarks=streamOfmarks.average();
		System.out.println("average of marks is : " +avgmarks);
	}
}
