package assignment_evln;

import java.util.stream.IntStream;

public class q14 {    
    public static void main(String[] args) {
		stringPermuteAndPrint("","chinmay");
    }
    private static void stringPermuteAndPrint(String prefix,String s) {
    	int a=s.length();
    	
    	if(a==0) {
    		System.out.println(prefix + " ");
    	}
    	else {
    		IntStream.range(0, a).parallel().forEach(m->stringPermuteAndPrint(prefix + s.charAt(m),s.substring(m+1,a) + s.substring(0,m)));
    	}
    }
	}