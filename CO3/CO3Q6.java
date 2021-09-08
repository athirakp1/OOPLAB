import java.util.Scanner;
class ReverseString
{
    public void revString(String str)
    {
        String eachWord[] = str.split("\\s");
        String revWord = "";
        for (String w : eachWord) 
        {
            StringBuilder sb = new StringBuilder(w); 
            sb.reverse(); 
            revWord = revWord + sb.toString() + " "; 
        }
        System.out.println("Reversed string is :   " + revWord.trim()); 
    }
}
class CO3Q6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str;
        ReverseString rstr = new ReverseString();
        System.out.println("");
        System.out.println("Enter a string :  ");
        str = in.nextLine();
        System.out.println(" ");
        System.out.println("Original string is :    " + str);
        rstr.revString(str);
    }
}