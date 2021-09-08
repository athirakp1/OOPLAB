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
        for(int i =0; i<=length; i++)
        {
            string[i] = in.nextLine();
        }
    }
    void sortString()
    {
        for(int i=0; i<=length-1; i++)
        {
            for(int j=i+1; j<=length; j++)
            {
                if (string[i].compareTo(string[j]) > 0) 
                {
                    String temp = string[i]; 
                    string[i] = string[j];
                    string[j] = temp;
                }
            }
        }
    }
    void displayAccending()
    {
        System.out.println("");
        System.out.println("Accending order string is");
        for(int i=0; i<=length; i++)
        {
            System.out.println(string[i]);
        }
    }
    void displayDecending()
    {
        System.out.println("");
        System.out.println("Decending order string is");
        for(int i=length; i>=0; i--)
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
        ssrt.displayAccending();
        ssrt.displayDecending();
    }
}