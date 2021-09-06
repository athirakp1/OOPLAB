import java.util.Scanner;
abstract class Shape
{
	public double len, bre;
	abstract void printArea(); 
}
class Rectangle extends Shape
{
	Rectangle()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Length And Breadth Of The Rectangle: ");
		len = in.nextDouble();
		bre = in.nextDouble();
	}
	void printArea()
	{
		double rectangleArea;
		rectangleArea = len * bre;
		System.out.println("Area Of The Reactangle: " + rectangleArea);
	}
}
class Triangle extends Shape 
{
 	Triangle()
 	{
 		Scanner in = new Scanner(System.in);
 		System.out.println("Enter The Height And Base Of The Triangle: ");
 		len = in.nextDouble(); //height of the triangle
 		bre = in.nextDouble(); //base of the triangle
 	}	
 	void printArea()
 	{
 		double triangleArea;
 		triangleArea = (len * bre)/2;
  		System.out.println("Area Of The Triangle: " + triangleArea);
  	}
}
class Circle extends Shape
{
	Circle()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Radius Of The Circle: ");
		len = in.nextDouble(); //radius of the circle;
	}
	void printArea()
	{
		double circleArea;
		circleArea = 3.14 * (len * len);
		System.out.println("Area Of The Circle: " + circleArea);
	}
}
class C3Q1
{
	public static void main(String args[])
	{
		Shape rect = new Rectangle();
		Shape tri = new Triangle();
		Shape crcl = new Circle();
		rect.printArea();
		tri.printArea();
		crcl.printArea();
	}
} 