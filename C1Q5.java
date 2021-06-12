import java.util.Scanner;
class Matrix
{
    Scanner in = new Scanner(System.in);
    int i,j,r,c;
    int a[][] = new int[100][100];
    void getRowColm() 
    {
        System.out.println("Enter the no. of Row and Column:");
        r = in.nextInt();
        c = in.nextInt();
    }
    void getMatrix() 
    {
        System.out.println("Enter the matrix:");
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
    }
    void checkSymmetic()
    {
        int f=0;
        for (i = 0; i < r; i++) 
        {
            for (j = 0; j < c; j++) 
            {
                if (a[i][j] != a[j][i])
                {
                    f=1;
                    break;
                } 
            }
        }
        if(f==0)
            System.out.println("The Matrix Is Symmetric ");
        else
            System.out.println("The Matrix Is Not Symmetric");
    }
}
public class C1Q5
{
    public static void main(String args[])
    {
        Matrix ob = new Matrix();
        ob.getRowColm();
        ob.getMatrix();
        ob.checkSymmetic();
    }
}


/*
OUTPUT
Enter the no. of Row and Column:
3
3
Enter the matrix:
2 5 9
3 7 1
6 4 8
The Matrix Is Not Symmetric

Enter the no. of Row and Column:
3
3
Enter the matrix:
0 1 2
1 0 1
2 1 0
The Matric Is Symmetric
*/