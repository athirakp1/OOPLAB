import java.util.Scanner;
class StringSort
{
    String [] string = new String[100];
    int length;
    void getString()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of strings : ");
        length = in.nextInt();
        System.out.println("Enter the string : ");
        for(int i =0; i<length; i++)
        {
            string[i] = in.next();
        }
    }
    void sortString()
    {
        for(int i=0; i<length; i++)
        {
		    for (int j=i+1; j<length;j++)
			{ 
			    if(string[i].length() < string[j].length())
				{
					
                    String temp = string[i]; 
                    string[i] = string[j];
                    string[j] = temp;
					
				}
			}
		}
	}
    void display()
    {
        System.out.println("===============");
        System.out.println("Decending order string is");
        for(int i=0; i<=length; i++)
        {
            System.out.println(string[i]);
        }
            for (int i = 0; i <length; i++)
			{
				for (int j = i+1; j <length; j++)
					{
						if (string[i].length() > string[j].length())
						{
							String temp = string[i];
                            string[i] = string[j];
                            string[j] = temp; 
		                } 
		            } 
		    }   
        System.out.println("===================");
        System.out.println("Ascending order string is");
        for(int i=0; i<length; i++)
        {
            System.out.println(string[i]);
        }
    }
}
class CO3Q7
{
    public static void main(String args[])
    {
        StringSort ssrt = new StringSort();
        ssrt.getString();
        ssrt.sortString();
        ssrt.display();
    }
}