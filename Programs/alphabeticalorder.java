import java.util.*;
public class alphabeticalorder 
{
	public static void main(String[] args) 
	{
		boolean h = false;
		int g;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter String");
		alpha a = new alpha(kb.nextLine());
		while (h == false)
		{
			System.out.println("Enter 1, 2, 3, 4, 5, 6");
			g = kb.nextInt();
			if (g == 1)
			{
				a.a1();
			}
			else if (g == 2)
			{
				a.a2();
			}
			else if (g == 3)
			{
				a.a3();
			}
			else if (g == 4)
			{
				a.a4();
			}
			else if (g == 5)
			{
				a.a5();
			}
			else if (g == 6)
			{
				a.bonus();
			}
			else
			{
				h = true;
			}
		}
		
	}
}
