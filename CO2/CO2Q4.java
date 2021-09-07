import java.util.Scanner;
class Publisher
{
	Scanner sc = new Scanner(System.in);
	String Name, Loc;
	Publisher()
	{
		System.out.println("ENTER THE PUBLISHER'S NAME: ");
		Name = sc.next();
		System.out.println("ENTER THE PUBLISHER LOCATION: ");
		Loc = sc.next();
	}
}
class Book extends Publisher
{
	Scanner sc = new Scanner(System.in);
	String authorName;
	Book()
	{
		System.out.println("ENTER THE AUTHOR NAME: ");
		authorName = sc.next();
	}
}
class Literature extends Book
{
	Scanner sc = new Scanner(System.in);
	String literatureTitle;
	int literaturePrice;
	Literature()
	{
		System.out.println("\nENTER THE BOOK (LITERATURE) TITLE:");
		literatureTitle = sc.next();
		System.out.println("ENTER THE BOOK PRICE: ");
		literaturePrice = sc.nextInt();
	}
	void displayLiterature()
	{
		System.out.println("\nLITERATURE DETAILS");
		
		System.out.println("PUBLISHER NAME: " + Name);
		System.out.println("PUBLISHER LOCATION: " + Loc);
		System.out.println("AUTHOR NAME: " + authorName);
		System.out.println("BOOK TITLE: " + literatureTitle);
		System.out.println("PRICE: " + literaturePrice);
	}
}
class Fiction extends Book
{
	Scanner sc = new Scanner(System.in);
	String fictionTitle;
	int fictionPrice;
	Fiction()
	{
		System.out.println("\nENTER THE BOOK (FICTION) TITLE:");
		fictionTitle = sc.next();
		System.out.println("ENTER THE BOOK PRICE: ");
		fictionPrice = sc.nextInt();
	}
	void displayFiction()
	{
		System.out.println("\nFICTION DETAILS");
		
		System.out.println("PUBLISHER NAME: " + Name);
		System.out.println("PUBLISHER LOCATION: " + Loc);
		System.out.println("AUTHOR NAME: " + authorName);
		System.out.println("BOOK TITLE: " + fictionTitle);
		System.out.println("PRICE: " + fictionPrice);
	}
}
public class CO2Q4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int input, i=1;
		Literature li = new Literature();
		Fiction fi = new Fiction();
		while(i <= 2)
		{
			System.out.println("FOR THE BOOK DETAILS (LITERATURE)  ENTER 1 :) ");
			System.out.println("FOR THE BOOK DETAILS (FICTIONS) ENTER 0 :) ");
			input = sc.nextInt();
			if(input == 1)
			{
				li.displayLiterature();
			}	
			else
			{
				fi.displayFiction();
			}
			i++;
		}
		
	}	
}