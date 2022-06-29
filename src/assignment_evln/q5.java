package assignment_evln;

import java.util.ArrayList;
import java.util.List;

public class q5 {
public static void main(String[] args) {
	String a[]={"vishnu","chinmay","kapil","chintu","kunal"};
	List<Integer> ls=new ArrayList<Integer>();
	
	for(String s:a) {
		int cout=0;
		char[]c=s.toCharArray();
		
		for(char ch:c) {
			cout++;
		}
		ls.add(cout);
		
	}
	Integer max=ls.stream().max((x,y)->x.intValue()>y.intValue()?1:-1).get();
	int ind=ls.indexOf(max);
	
	System.out.println("longest string is : " +a[ind]);
	System.out.println("cout is : " +max);
}
}
