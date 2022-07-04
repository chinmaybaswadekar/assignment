package TDD_2;

import java.time.LocalDate;

public class Question_15 {

	public boolean check(int itemid) {
		int co=0;
		while(itemid>0) {
			itemid=itemid/10;
			co++;
		}
		if(co>=3) {
			return true;
		}else
			return false;
	}
	      public boolean al(String itemname) {
	    	  if (itemname.matches("[a-zA-Z]+")) {
	    		  return true;
	    	  }else {
	    		  return false;
	    	  }
	      }
	      public boolean contain(int cost_price) {
	    	  if(cost_price>=0) {
	    		  return true;
	    	  }else {
	    		  return false;
	    	  }
	    	  }
	      public boolean doecheck(LocalDate doe ) {
	    	  if (doe.compareTo(LocalDate.now())!=0)
	    	  {
	    		  return true;
	    	  }else {
	    		  return false;
	    	  } 
	    	  }
	      public boolean same(int cp,int sp) {
	    	  if (cp!=sp) {
	    		  return true;
	    	  }else {
	    		  return false;
	    	  }
	      }
}
