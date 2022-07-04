package TDD_2;

public class Question_4 {

	public static boolean armstrong(int n) {
		int temp,dig=0,last=0,sum=0;
		
		temp=n;
		//return false;
		while(temp>0) {
			temp=temp/10;
			dig++;
		}
		
		temp=n;
		while(temp>0) {
			last=temp%10;
			sum+=(Math.pow(last, dig));
			temp=temp/10;
		}
		if(n==sum) {
			return true;
		}
			else {
				return false;
			}
		}
		
	}

