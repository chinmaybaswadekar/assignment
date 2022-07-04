package TDD_2;

public class Question_6 {

	
	public static boolean str(String s) {
		char ch='a';
		char vh='c';
		char mn='i';
		
		for (int i=0;i<s.length()-1;i++) {
			if (s.charAt(i)==ch || s.charAt(i)==vh || s.charAt(i)==mn) {
				return true;
			}else {
				return false;
				
			}
		}
		return false;
	}

}
