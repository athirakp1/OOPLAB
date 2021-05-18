import java.util.*;
class complex{
	double r,i;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	complex b=new complex();
	complex c=new complex();
	System.out.println("Enter the complex number n1:");
	b.r=sc.nextDouble();
	b.i=sc.nextDouble();
	System.out.println("Enter the complex number n2:");
	c.r=sc.nextDouble();
	c.i=sc.nextDouble();
	double sr=c.r+b.r;
	double si=c.i+b.i;
	System.out.println("Sum:"+sr+"+"+si+"i");
}
}
//output
Enter the complex number n1:
4.8
8.9
Enter the complex number n2:
5.6
3
Sum:10.399999999999999+11.9i