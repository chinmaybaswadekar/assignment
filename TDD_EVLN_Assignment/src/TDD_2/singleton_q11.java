package TDD_2;

 class question11 {
private static  question11 qo=new  question11();

private  question11 (){
}
 static question11 gesingleton() {
		return qo;
}

 }
 public class singleton_q11{
	 public static boolean check(question11 st1,question11 st2) {
		 if (st1.hashCode()==st2.hashCode()) {
		return false;
		 }else {
			 return false;
		 }
		 
	 }

	
	
	
	}
 
