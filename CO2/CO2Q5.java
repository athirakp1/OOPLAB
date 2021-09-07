import java.util.Scanner;
class STUD
{
 Scanner in = new Scanner(System.in);
 int roll_No,Mark;
 String sName, dName;
 STUD()
 {
  System.out.println("ENTER THE ROLL No.: ");
  roll_No = in.nextInt();
  System.out.println("ENTER THE STUDENT NAME: ");
  sName = in.next();
  System.out.println("ENTER THE DEPARTMENT NAME: ");
  dName = in.next();
 }
 void gets()
 {
  System.out.println("ENTER THE TOTAL MARK FOR ALL SUUBJECTS: ");
  Mark = in.nextInt();
 }
}
interface SPORTS   
{
 final int sportsMark = 20;
}
class RESULT extends STUD implements SPORTS
{
 int tMark;
 void TotalMark()
 {
  tMark = Mark + sportsMark;
 }
 void PUTS()
 {
  System.out.println("........RESULT........");
  System.out.println("ROLL NUMBER    :" + roll_No);
  System.out.println("NAME           :" + sName);
  System.out.println("DEPARTMENT NAME:" + dName);
  System.out.println("SUBJECT MARKS  :" + Mark);
  System.out.println("SPORTS MARKS   :" + sportsMark);
  System.out.println("TOTAL MARKS    :" + tMark);
 }
}
class CO2Q5
{
 public static void main(String args[])
 {
  RESULT rslt = new RESULT();
  rslt.gets();
  rslt.TotalMark();
  rslt.PUTS();
 }
}