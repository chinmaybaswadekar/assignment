package assignment_evln;

import java.util.Arrays;

public class q4 {
	public static void main(String[] args) {
		
	
int a[] = {23,22,35,57,89,67};

int max=Arrays.stream(a).max().getAsInt();

System.out.println("maximum no is : " +max);
}
}