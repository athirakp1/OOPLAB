import java.util.Scanner;
class EMP
{
    Scanner in = new Scanner(System.in);
    int empid,sal;
    String ename,add;
    EMP()
    {
        System.out.println("ENTER THE EMPLOYEE ID:");
        empid = in.nextInt();
        System.out.println("ENTER THE EMPLOYEE NAME:");
        ename = in.next();
        System.out.println("ENTER THE SALLARY:");
        sal = in.nextInt();
        System.out.println("ENTER THE ADDRESS:");
        add = in.next();
    }
}

class TEACHER extends EMP
{
    Scanner in = new Scanner(System.in);
    String dept,sub;
    TEACHER()
    {
        System.out.println("ENTER THE DEPARTMENT NAME:");
        dept = in.next();
        System.out.println("ENTER THE SUBJECT NAME:");
        sub = in.next();
    }
    void PUTS()
    {
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("*****************");
        System.out.println("EMP ID: " + empid);
        System.out.println("NAME: " + ename);
        System.out.println("ADDRESS: " + add);
        System.out.println("DEPARTMENT: " + dept);
        System.out.println("SUBJECT: " + sub);
        System.out.println("SALLARY: " + sal);
        System.out.println("*******************");
    }
}

public class CO2Q2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NO. OF EMPLOYEES:");
        int n = in.nextInt();
        TEACHER ob[] =new TEACHER[n];
        for (int i=0;i<n;i++)
        {
            ob[i] = new TEACHER();
            ob[i].PUTS();
        }
    }
}