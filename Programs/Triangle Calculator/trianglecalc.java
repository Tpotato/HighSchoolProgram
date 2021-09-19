
import java.util.Scanner; 
public class trianglecalc 
{
	public static void main(String[] args)
	{
		double one = 1, two = 1, three = 1; 
		int num = 1;
		String cha;
		Scanner kb = new Scanner(System.in);
		System.out.println("Input Triangle Dimensions: ");
		one = kb.nextDouble();
		two = kb.nextDouble();
		three = kb.nextDouble();
		while ( two + three <= one || one + two <= three || one + three <= two)
		{
			System.out.println("Invalid Triangle");
			one = kb.nextDouble();
			two = kb.nextDouble();
			three = kb.nextDouble();
		}
		triangle tri = new triangle(one, two, three);
		kb.nextLine();
		while (num == 1)
		{
			System.out.println("Do you want Area(A), Perimeter(P), Edit the Triangle (E), or Exit the Program (X)?");
			cha = kb.nextLine();
			if (cha.equalsIgnoreCase("a"))
			{
				tri.sysa();
			}
			else if (cha.equalsIgnoreCase("p"))
			{
				tri.sysp();
			}
			else if (cha.equalsIgnoreCase("e"))
			{
				System.out.println("Input Triangle Dimensions: ");
				one = kb.nextDouble();
				two = kb.nextDouble();
				three = kb.nextDouble();
				while ( two + three <= one || one + two <= three || one + three <= two)
				{
					System.out.println("Invalid Triangle");
					one = kb.nextDouble();
					two = kb.nextDouble();
					three = kb.nextDouble();
				}
				tri.setSize(one, two, three);
			}
			else if (cha.equalsIgnoreCase("x"))
			{
				num=0;
			}
		}
	}
}
