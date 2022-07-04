package TDD_2;
/*Write a Junit test to check given string is removed all digits, white space and special 
character. For example in your main code you will read following string This @ Red $car-.
When you run your main code it will return following string This red car.*/
public class Question_9 {

public static String st(String s) {
s = s.replaceAll("[^a-zA-Z0-9]", "");  
System.out.println(s);
return s;  
}  
}  