package assignment_evln;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q3 {
public static void main(String[] args) {
	List<String> is=Arrays.asList("pratik","prathmesh","rahul","ajay","prathmesh");
     	List<String> ls=is.stream().distinct().collect(Collectors.toList());
	System.out.println("distinct elements are : " +ls);

	
}
}
