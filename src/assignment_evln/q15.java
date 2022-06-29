package assignment_evln;


interface Ab
{
int max();
}

public class q15 {

public static void main(String []args)
{
Ab obj=()->{
int a[]={5,3,4,7,8,12,14,17,10};
int count=0;
for(int i=0;i<a.length-3;i++) {
	int x=a[i]*a[i];
	int y=a[i+1]*a[i+1];
	int z=a[i+2]*a[i+2];
	
	if (x==y+z||y==x+z||z==x+y) {
	count++;
	System.out.println("the pair which satisfies pythagorus template is : " + a[i] + " " +a [i+2] + " " + a[i+3]);
	System.out.println("total no of pairs " +count);
	}

	}
return count;
};
System.out.println(obj.max());

}}
 






