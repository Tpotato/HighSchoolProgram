package HW;
import java.util.*;
public class apcs830_Polygoncalc 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int num = 1;
		String cha;
		System.out.println("Enter number of nodes: ");
		int nodes = kb.nextInt();
		while (nodes<3)
		{
			if (nodes == 1) System.out.println("This is a point, not a polygon."); 
			else if (nodes == 2) System.out.println("This is a line, not a polygon."); 
			else System.out.println("This is not a valid polygon.");
			nodes = kb.nextInt();
		}
		apcs830_polygon poly = new apcs830_polygon(nodes);
		for (int count = 0; count < nodes; count++)
		{
			System.out.println("Enter point " + (count+1) + ":");
			poly.adding(kb.nextDouble(), kb.nextDouble());
			
		}
		kb.nextLine();
		while (num==1)
		{
			System.out.println("Do you want Area(A), Perimeter(P), Edit the Polygon(E), or Exit the Program (X)?");
			cha = kb.nextLine();
			if (cha.equalsIgnoreCase("a"))
			{
				poly.sysa();
			}
			else if (cha.equalsIgnoreCase("p"))
			{
				poly.sysp();
			}
			else if (cha.equalsIgnoreCase("e"))
			{
				System.out.println("Enter number of nodes:");
				nodes = kb.nextInt();
				poly.syse(nodes);
				for (int count = 0; count < nodes; count++)
				{
					System.out.println("Enter point " + (count+1) + ":");
					poly.adding(kb.nextDouble(), kb.nextDouble());
				}
				kb.nextLine();
			}
			else if (cha.equalsIgnoreCase("x"))
			{
				num=0;
			}
		}
	}
}
