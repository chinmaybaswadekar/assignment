package TDD_2;

public class Question_2 {

	public static boolean palindrome(String a,String b) {
		String s="";
		for (int i = a.length() - 1; i >= 0; i--) {
            s = s + s.charAt(i);
			
			
			if (s.equals(b)) {
				return true;
			}else {
				return false;	
			}
		}
		return true;
	
	}
	public static void main(String[] args) {
		Question_2.palindrome("abba", "abba");
		
	}
}
