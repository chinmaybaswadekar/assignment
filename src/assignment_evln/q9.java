package assignment_evln;

import java.util.Arrays;
import java.util.List;

public class q9 {
	public static void main(String[] args) {
		
	//to count the odd numbers 
  List<Integer> list = Arrays.asList(1, 4, 34,18,12,6, 7, 9, 11);
  long count = list.stream().filter(x -> x%2!=0).count();
  System.out.println("total number of odd numbers : "+count);
  
  //to count the even numbers
  long coun = list.stream().filter(x -> x%2==0).count();
  System.out.println("total number of even numbers : " +coun);

}
}