package TDD_2;
/*Write a Junit test to check given array of strings is passed to the main code and it will return 
the concatenated string. You have to test the string which is return is matched or not. For 
example we have enter array of following names String furits = {“apple”, 
“orange”,”banana”,”lemon”}. It will return apple-orange-banana-lemon. Test all cases 
means data can be enter in either capital or lower case. You have to make sure test will be 
satisfy.*/
public class Question_10 {

	public static String con(String s[]) { 
	   String join=String.join("-", s);
	return join;
	}
}