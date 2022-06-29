package assignment_evln;


interface AA
{
int max();
}

public class q12 {

public static void main(String []args)
{
AA obj=()->{
int a[]={10,20,40,30,60};

int max = a[0];


for (int i = 1; i < a.length; i++)
    if (a[i] > max)
        max = a[i];
 
return max;


};
System.out.println("Max number is:"+obj.max());
}

}