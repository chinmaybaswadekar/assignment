package spring_evln_a;

public class Quest_6 {
	String str[];

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	public void show() {
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
		public String result() {
			
		for(String b:str) {
			String s1=b.replaceAll("[aeiouAEIOU]", "");
			if(b.equals(s1)) 
				System.out.println(b);
			return b;

			}
		return null;
		}
		
		}
