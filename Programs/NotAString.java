
import java.util.*;
public class NotAString 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the String");
		apcs903_StringClass NotAString = new apcs903_StringClass(kb.nextLine());
		NotAString.length();
		NotAString.charAt(kb.nextInt());
		NotAString.replace(kb.next().charAt(0), kb.next().charAt(0));
		NotAString.toUpperCase();
		NotAString.toLowerCase();
		NotAString.substring(kb.nextInt(), kb.nextInt());	
	}
	
}
