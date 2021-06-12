import java.util.Scanner;
class CPU
{
	int cpu_price;
	CPU()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the price of the CPU: ");
		cpu_price = in.nextInt();
	}
	void cpuDisplay()
	{
		System.out.println("CPU PRICE: "+ cpu_price);
	}
	class Processor
	{
		int p_core;
		String p_manufacture;
		Processor()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the no. of cores: ");
			p_core = in.nextInt();
			System.out.print("Enter the manufacturer name:");
			p_manufacture = in.next();
		}
		void processorDisplay()
		{
			System.out.println("The no. of cores: "+ p_core);
			System.out.println("Manufacturer name: "+ p_manufacture);
		}
	}
	static class RAM 
	{
		int memory;
		String r_manufacture;
		RAM()
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the size of memory:");
			memory = in.nextInt();
			System.out.print("Enter the manufacturer name:");
			r_manufacture = in.next();

		}
		void ramDisplay()
		{
			System.out.println("Memory: "+ memory+" TB");
			System.out.println("The manufacturer name:"+ r_manufacture);
		}
	}
}
class C1Q9
{
	public static void main(String args[])
	{
		CPU c = new CPU();
		CPU.Processor p = c.new Processor();
		CPU.RAM r = new CPU.RAM();
		c.cpuDisplay();
		p.processorDisplay();
		r.ramDisplay();
	}
}