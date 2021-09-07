import java.util.Scanner;
class PERSON
{
    Scanner in = new Scanner(System.in);
    String gender,address,name;
    int age;
    PERSON()
    {
        System.out.println("PERSON DETAILS:");
        System.out.println("****************");
        System.out.print("NAME: ");
        name = in.next();
        System.out.print("ADDRESS: ");
        address = in.next();
        System.out.print("GENDER: ");
        gender = in.next();
        System.out.print("Age: ");
        age = in.nextInt();
        System.out.println("****************");
    }
}

class EMP extends PERSON
{
    int empid,sal;
    String cmp_name,qualification;
    Scanner in = new Scanner(System.in);
    EMP()
    {
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("******************");
        System.out.print("COMPANY NAME:");
        cmp_name = in.next();
        System.out.print("EMPLOYEE ID:");
        empid = in.nextInt();
        System.out.print("QUALIFICATION:");
        qualification = in.next();
        System.out.print("SALLARY:");
        sal = in.nextInt();
        System.out.println("******************");
    }
}
class TEACHER extends EMP{
    Scanner in = new Scanner(System.in);
    String dept,sub;
    int tID;
    TEACHER()
	{
        System.out.println("TEACHER DETAILS");
        System.out.println("***************");
        System.out.print("DEPARTMENT NAME: ");
        dept = in.next();
        System.out.print("SUBJECT NAME: ");
        sub = in.next();
        System.out.print("TEACHER ID: ");
        tID = in.nextInt();
        System.out.println("*****************");
    }
    void PUTS()
    {
        System.out.println("DETAILS");
        System.out.println("******");
        System.out.println("NAME: " + name);
        System.out.println("GENDER: " + gender);
        System.out.println("AGE: " + age);
        System.out.println("COMPANY NAME: " + cmp_name);
        System.out.println("EMPLOYEE ID: " + empid);
        System.out.println("QUALIFICATION: " + qualification);
        System.out.println("TEACHER ID: " + tID);
        System.out.println("ADDRESS: " + address);
        System.out.println("SUBJECT: " + sub);
        System.out.println("DEPARTMENT: " + dept);
        System.out.println("SALARY: " + sal);
        System.out.println("******");
    }
}
public class CO2Q3 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NO OF EMPLOYEES");
        int n=  in.nextInt();
        TEACHER ob[] = new TEACHER[n];
        for (int i=0;i<n;i++)
        {
            ob[i]=new TEACHER();
            ob[i].PUTS();
        }
    }
}