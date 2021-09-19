
import java.util.ArrayList;
public class StringClass 
{
	private String copy, characters;
	ArrayList<Character> list = new ArrayList<Character>();
	public StringClass(String cha)
	{		
		for (int count = 0; count < cha.length(); count++)
		{
			list.add(cha.charAt(count));
		}
	}
	public void length()                  
	{
		System.out.println(list.size());
	}
	
	public void charAt(int num)
	{
		System.out.println(list.get(num-1));
	}
		
	public void replace(char x, char y)
	{
		for (int count = 0; count < list.size(); count++)
		{
			if (list.get(count).equals(x))
			{
				list.set(count, y);
			}
			System.out.print(list.get(count));
		}
		System.out.println();
	}
	
	public void toUpperCase()
	{
		for (int count = 0; count < list.size(); count++)
		{
			if (list.get(count)>=97&&list.get(count)<=123)
			{
				list.set(count, (char)(list.get(count)-32));
			}
			System.out.print(list.get(count));
		}
		System.out.println();
	}
	
	public void toLowerCase()
	{
		for (int count = 0; count < list.size(); count++)
		{
			if (list.get(count)>=65&&list.get(count)<=90)
			{
				list.set(count, (char)(list.get(count)+32));
			}
			System.out.print(list.get(count));
		}
		System.out.println();
	}
	
	public void substring(int start, int end)
	{
		for (int count = start-1; count < end; count++)
		{
			System.out.print(list.get(count));
		}
		System.out.println();
	}
}
