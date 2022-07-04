package TDD_2;
//Write a Junit test to check given array of numbers contains given number of even or not.
public class Question_8 {

	public static boolean evenno(int n) {
		int a[]= {3,5,6,8,9,2,n};
		for (int i=0;i<a.length-1;i++) {
			if ( n%2==0) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
