import java.util.Scanner;
abstract class Shape{
abstract void draw();
abstract void erase(); }

class square extends Shape
{
 void draw()
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the side of square");
   int s=sc.nextInt();
   System.out.println("Square each side is "+s);
   System.out.println("Area is " +s*s);
  }
 void erase()
  {
   System.out.println("Erased Square"); 
  }
}

class triangle extends Shape
{
 void draw()
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("\nEnter the base and height of traingle");
  int b=sc.nextInt();
  int h=sc.nextInt();
  System.out.println("Base length and Hypotenues are "+b+" and "+h);
  System.out.println("Area is " +(b*h)/2);
 }
 void erase()
 {
  System.out.println("Erased Triangle"); 
  } 
}

class circle extends Shape
{
 void draw() {
 Scanner sc = new Scanner(System.in);
 System.out.println("\nEnter the radius");
 int r=sc.nextInt();
 System.out.println("Circle of radius "+r);
 System.out.println("Area is "+3.14*r*r);
 }
 void erase(){
 System.out.println("Erased Circle"); } }


class CO3Q3 {
    public static void main(String[] args)
    { 
     Shape s=new square();
        s.draw();
        s.erase();
  
      Shape t= new triangle();
        t.draw();
        t.erase();

        Shape c= new circle();
        c.draw();
        c.erase();
     }
}