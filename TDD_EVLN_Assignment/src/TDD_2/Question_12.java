package TDD_2;

public class Question_12 implements Cloneable{
	
	int qid;
	String name;
	public Question_12(int qid, String name) {
		super();
		this.qid = qid;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException{
		
		return super.clone();
	}
	public static boolean mk(){
		
		try{  
			Question_12  s1=new Question_12 (10,"pratik");  
		  
			Question_12  s2=(Question_12 )s1.clone();  
		  if (s1.equals(s2)) {
			  return true;
		  }else {
			  return false;
		  }
		
		}catch(CloneNotSupportedException c){}
		return false;
		
		}  
}
