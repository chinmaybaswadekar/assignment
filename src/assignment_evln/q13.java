package assignment_evln;

//. Consider a scene we are having following series, 1,2,3,6,7,8,10,11,12,13,14,17,18,19,20 
//Now you need to print the output in following way
//1-3,6-8,10-14,17-20

public class q13 {

	
	public static void main(String[] args) {
		
		int a[]= { 1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
		for (int i=0;i<a.length;i++)
		{
			if (a[i]<=1) {
				System.out.println(a[i]+"-"+a[i+2]);
			}
		if (a[i+2]<=6) {
			
			System.out.println(a[i+3]+"-"+a[i+5]);
                 
                  }
		
			if (a[i+6]<=10) {
		System.out.println(a[i+6]+"-"+a[i+10]);
			
		}	
			
			 if (a[i+11]<=17) {
				System.out.println(a[i+11]+"-"+a[i+14]);
				break;
		}	
			
	}
	}}
