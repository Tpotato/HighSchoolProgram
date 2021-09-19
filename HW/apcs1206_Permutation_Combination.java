package HW;
import java.util.Scanner;
public class apcs1206_Permutation_Combination 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		boolean con = true;
		String check = "";
		int n=0, r =0;
		while(con)
		{
			System.out.println("Enter n and r");
			n = kb.nextInt();
			r = kb.nextInt();
			System.out.println("Result: " +(factorial(n)/factorial(r)/factorial(n-r))+ " Combinations "+(factorial(n)/factorial(n-r))+" Permutations");
			System.out.println("Continue?(y/n)");
			kb.nextLine();
			check = kb.nextLine();
			if(check.equalsIgnoreCase("n"))
			{
				con = false;
			}
		}
		System.out.println("Thank you!");
	}
	public static int factorial(int c)
	{
		if (c>1) c=c*(factorial(c-1));
		else if (c==0) c = 1;
		return c;
	}
	
}
