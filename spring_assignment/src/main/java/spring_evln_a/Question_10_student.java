package spring_evln_a;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_10_student {
	private HashMap<String, Integer> std;


	   public Question_10_student() {
	       super();
	   }

	   public Map<String, Integer> getStd() {

	       
	       Map<String, Integer> tempMap = std.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue , (e1, e2) -> e1, LinkedHashMap :: new));
	       System.out.println(tempMap);
	       return std;    

	   }
	   public void setStd(HashMap<String, Integer> std) {
	       this.std = std;
	      
	   }
	   
	}
