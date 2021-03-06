import java.util.Scanner;
class Investment
{
	Scanner in = new Scanner(System.in);
	static  double depositAmount ;
	static int durationOfDeposit ;
	void getDepositInfo()
	{
		System.out.print("Enter The Amount Of Deposit       : ");
		depositAmount = in.nextDouble();
		System.out.print("Enter The Duration Of Deposit : ");
		durationOfDeposit = in.nextInt();
	}
}
class BankFederal extends Investment
{
	double finalAmount, intrestAmount, totalIntrestAmount;
	BankFederal()
	{

	}
	void calculateInterestFederal()
	{
		//double rateStarYear;
		//rateStarYear = .84 * durationOfDeposit;
		intrestAmount = (depositAmount * 8.4)/100;
		finalAmount = depositAmount + (intrestAmount * durationOfDeposit);
		//finalAmount = depositAmount * (1 + (.84 * durationOfDeposit));
		totalIntrestAmount = finalAmount - depositAmount;
		//System.out.println(rateStarYear);
		
	}
	void displayInterestFederal()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("		      FEDERAL BANK                           ");
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Deposit Amount            : " + depositAmount);
		System.out.println("Duration Of Deposit       : " + durationOfDeposit);
		System.out.println("Intrest Rate In Percentage: " + 8.4 + "%");
		System.out.println("Intrest Per Year          : " + intrestAmount);
		System.out.println("Final Amount              : " + finalAmount);
		System.out.println("Total Intrest Amount      : " + totalIntrestAmount);
		System.out.println("=====================================================");
	}
}
class BankKarur extends Investment
{
	double finalAmount, intrestAmount, totalIntrestAmount;
	BankKarur()
	{

	}
	void calculateInterestKarur()
	{	
		intrestAmount = (depositAmount * 7.3)/100;
		finalAmount = depositAmount + (intrestAmount * durationOfDeposit);
		totalIntrestAmount = finalAmount - depositAmount;
	}
	void displayInterestKarur()
	{
		System.out.println("------------------------------------------------------");
		System.out.println("		    KARUR BANK                                ");
		System.out.println("------------------------------------------------------");
		System.out.println("Deposit Amount            : " + depositAmount);
		System.out.println("Duration Of Deposit       : " + durationOfDeposit);
		System.out.println("Intrest Rate In Percentage: " + 7.3 + "%");
		System.out.println("Intrest Per Year          : " + intrestAmount);
		System.out.println("Final Amount              : " + finalAmount);
		System.out.println("Total Intrest Amount      : " + totalIntrestAmount);
		System.out.println("=====================================================");
	}
}
class BankBOI extends Investment
{
	double finalAmount, intrestAmount, totalIntrestAmount;
	BankBOI()
	{

	}
	void calculateInterestBOI()
	{	
		intrestAmount = (depositAmount * 9.7)/100;
		finalAmount = depositAmount + (intrestAmount * durationOfDeposit);
		totalIntrestAmount = finalAmount - depositAmount;
	}
	void displayInterestBOI()
	{
		System.out.println("-----------------------------------------------------");
		System.out.println("		    BANK OF INDIA                            ");
		System.out.println("-----------------------------------------------------");
		System.out.println("Deposit Amount            : " + depositAmount);
		System.out.println("Duration Of Deposit       : " + durationOfDeposit);
		System.out.println("Intrest Rate In Percentage: " + 9.7 + "%");
		System.out.println("Intrest Per Year          : " + intrestAmount);
		System.out.println("Final Amount              : " + finalAmount);
		System.out.println("Total Intrest Amount      : " + totalIntrestAmount);
		System.out.println("=====================================================");
	}
}
class CO3Q2 extends Investment
{
	public static void main(String args[])
	{
		BankFederal fed = new BankFederal();
		BankKarur kar = new BankKarur();
		BankBOI boi = new BankBOI();
		fed.getDepositInfo();
		fed.calculateInterestFederal();
		kar.calculateInterestKarur();
		boi.calculateInterestBOI();
		fed.displayInterestFederal();
		kar.displayInterestKarur();
		boi.displayInterestBOI();
		//System.out.print(fed.finalAmount);
		System.out.println("");
		if(fed.intrestAmount > kar.intrestAmount && fed.intrestAmount > boi.intrestAmount)
		{
			System.out.println(" FEDERAL BANK WILL BE A GRATE OPTION FOR INVESTMENT || 8.4% INTREST PER YEAR || ");
		}
		else if(kar.intrestAmount > boi.intrestAmount)
		{
			System.out.println(" KARUR BANK WILL BE A GRATE OPTION FOR INVESTMENT || 7.3% INTREST PER YEAR ||");
		}
		else
		{
			System.out.println(" BANK OF INDIA WILL BE A GRATE OPTION FOR INVESTMENT || 9.7% INTREST PER YEAR ||");

		}
	}	
}