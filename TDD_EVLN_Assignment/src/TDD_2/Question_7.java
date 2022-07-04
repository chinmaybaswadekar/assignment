package TDD_2;

public class Question_7 {

public static boolean palindrome_number(int n) {
	     int reverse= 0, rem;
	    
	    int originalNum = n;
	    
	    
	    while (n != 0) {
	      rem = n % 10;
	      reverse = reverse * 10 + rem;
	      n/= 10;
	    }
	    
	    if (originalNum == reverse) {
               return true	; 
            		   }
	    else {
return false;	    }
		
	  }
	}
	
	


	