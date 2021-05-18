import java.util.Scanner;

public class employee {
	int eno,esalary;
	String ename;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		employee[] em=new employee[3];
		System.out.println("enter the Limit");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of the employee:");
			em[i]=new employee();
			em[i].eno=sc.nextInt();
			em[i].esalary=sc.nextInt();
			em[i].ename=sc.next();
		}
		System.out.println("Enter the eno:");
		int enoo=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(em[i].eno==enoo)
			{
				System.out.println("Employee found");
				break;
			}
			if(i==n-1)
			{
				System.out.println("Employee not found:");
			}
		}


	}

}

//output
enter the Limit
2
Enter the details of the employee:
1
4000
anu
Enter the details of the employee:
2
5000
manu
Enter the eno:
1
Employee found