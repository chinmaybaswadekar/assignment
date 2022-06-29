package assignment_evln;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q2 {
public static void main(String[] args) {
	//list of integers
	
	List<Integer> is=Arrays.asList(2,35,22,19,32,18,19);
	
	List<Integer> ls=is.stream().distinct().collect(Collectors.toList());
	System.out.println("distnict elements are  :" +ls);
}
}
