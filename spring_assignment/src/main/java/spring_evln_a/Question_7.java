package spring_evln_a;

import org.springframework.beans.factory.annotation.Autowired;

/*WAP to merge two Array from two different class. Two array will get values from the xml file 
and now find maximum out of the merge array*/

public class Question_7 {

	int a[];

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	@Autowired
	Question_7class2 qw;
	
	
	int a1=a.length;
	int b1=qw.a2;
	
	int c=a1+b1;
	 int[] c1 = new int[a1];

	 {
		
	 
	 for (int q = 0; q < a1; q = q+ 1) {
        
         c1[q] = a[q];
     }

     
     for (int w = 0; w < b1; w =w + 1) {

         
         c1[a1 + w] = qw.b[w];
     }

     
     for (int s = 0; s < c1; s= s + 1) {
           
        
         System.out.println(c[s]);
     }
 }
}
