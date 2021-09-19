package HW;
import java.util.*;
public class apcs920_equals 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		apcs920_House house1 = new apcs920_House("1234 Hello St.",12345,12,true);
		System.out.println("Enter house 2: Adress(Enter)Price(Enter)Size(Enter)isSold(Enter)");
		apcs920_House house2 = new apcs920_House(kb.nextLine(),kb.nextDouble(),kb.nextInt(),kb.nextBoolean());
		System.out.println(house1.equals(house2));
	}
}
