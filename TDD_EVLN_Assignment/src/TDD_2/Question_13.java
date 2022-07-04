package TDD_2;

public class Question_13 {

	public static int ad(int x,int y){
		int z=x+y;
		return z;
		
	}
	public static int sub(int x,int y) {
		int z=x-y;
		return y;
		
	}
	public static int mul(int x,int y) {
		int z=x*y;
		return z;
	}
	public static boolean div(int x,int y) {
		try {
			int z=x/y;
			return true;
		}catch(ArithmeticException e) {
			
		
		return false;
		}
		
		}
	public static boolean mod(int x,int y) {
		try {
			int z=x%y;
			return true;
		}catch(ArithmeticException e) {
		return false;
		}
	
		}
	public static double po(double x) throws Exception{
		double qb=1;
		if (x<0) {
			throw new Exception("no cannot be less than zero");
		}else {
			qb=Math.cbrt(x);
		}
		return qb;
	}
	public static double sqr(double a) throws Exception{
		double sq=1;
		if (a<0)
		{
			throw new Exception("no can not be less tha zero");
		}else {
			sq=Math.sqrt(a);
		}
		return a;
		
	}
}
