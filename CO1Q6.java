import java.util.Scanner;
class StringSort
{
	String s[] = new String [10];
	int n;
	void getString()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		n = in.nextInt();
		System.out.println("Enter the strings: ");
		System.out.println("=====================");
		for(int i=0;i<=n;i++)
			s[i] = in.nextLine();
	}
	void sortString()
	{
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int chk = s[i].compareTo(s[j]);
				if(chk > 0)
				{
					String temp_string =s[i];
					s[i] = s[j];
					s[j] = temp_string;
				}
			}
		}
		System.out.println("sorted string is ");
		System.out.println("==================");
		for(int k=0;k<=n;k++)
			System.out.println(s[k]);
	}
}
class CO1Q6
{
	public static void main(String args[])
	{
		StringSort ob = new StringSort();
		ob.getString();
		ob.sortString();
	}
}