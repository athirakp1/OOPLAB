import java.util.*;
public class product {
int pcode,price;
String pname;

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
product[] p=new product[3];
for(int i=0;i<3;i++)
{
	System.out.println("Enter the product details:");
	p[i]=new product();
	p[i].pcode=sc.nextInt();
	p[i].price=sc.nextInt();
	p[i].pname=sc.next();
}

if(p[0].price<p[1].price)
{
	if(p[0].price<p[2].price)
	System.out.println(p[0].price+" is smallest price");
	else
	System.out.println(p[1].price+" is smallest price");
}
else if(p[1].price<p[2].price)
System.out.println(p[1].price+" is smallest price");
else
System.out.println(p[2].price+" is smallest price");
}	
}	
		
//output
Enter the product details:
123
30000
watch
Enter the product details:
124
100000
mobile
Enter the product details:
125
200000
laptop
30000 is smallest price