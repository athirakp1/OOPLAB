import java.util.*;
class complex{
	int r,i;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	complex b=new complex();
	complex c=new complex();
	System.out.println("Enter the complex number n1:");
	b.r=sc.nextInt();
	b.i=sc.nextInt();
	System.out.println("Enter the complex number n2:");
	c.r=sc.nextInt();
	c.i=sc.nextInt();
	int sr=c.r+b.r;
	int si=c.i+b.i;
	System.out.println("Sum:"+sr+"+"+si+"i");
}
}
/*output
Enter the complex number n1:
4.8
8.9
Enter the complex number n2:
5.6
3
Sum:10.399999999999999+11.9i */