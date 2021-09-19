import java.util.*;
public class equals 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		House house1 = new House("1234 Hello St.",12345,12,true);
		System.out.println("Enter house 2: Adress(Enter)Price(Enter)Size(Enter)isSold(Enter)");
		House house2 = new House(kb.nextLine(),kb.nextDouble(),kb.nextInt(),kb.nextBoolean());
		System.out.println(house1.equals(house2));
	}
}
