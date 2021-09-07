import java.util.Scanner;
class SHAPE
{
	int len,wid,r,h;
	double a;
	Scanner in = new Scanner(System.in);
	void Area()
	{
		System.out.println("ENTER THE LENGTH OF THE RECTANGLE:");
		len = in.nextInt();
		System.out.println("ENTER THE BREADTH OF THE RECTANGLE:");
		wid = in.nextInt();
		a = len*wid;
		System.out.println("AREA OF THE RECTANGLE: "+ a);
	}
	void Area(int x)
	{
		r = x;
		a = 3.14*r*r;
		System.out.println("AREA OF THE CIRCLE: "+ a);
	}
	double Area(int x,int y)
	{
		r = x;
		h = y;
		a = (2*3.14*r*h)+(2*3.14*r*r);
		return(a);
	}
}
class CO2Q1
{
	public static void main(String args[])
	{
		SHAPE ob = new SHAPE();
		int r,h;
		double v;
		Scanner in = new Scanner(System.in);
		ob.Area();
		System.out.println("ENTER THE RADIUS OF THE CIRCLE:");
		r = in.nextInt();
		ob.Area(r);
		System.out.println("ENTER THE RADIUS OF THE CYLINDER:");
		r = in.nextInt();
		System.out.println("ENTER THE HEIGHT OF THE CYLINDER:");
		h = in.nextInt();
		v = ob.Area(r,h);
		System.out.println("AREA OF THE CYLINDER: "+ v);
	}
}