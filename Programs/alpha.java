import java.util.*;
public class alpha 
{
	String ini;
	public alpha(String init)
	{
		ini = init;
	}
	public void a1()
	{
		for (int j = 65; j < 65+26; j++)//97
		{
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j)
				{
					System.out.print(ini.charAt(i));
				}
			}
		}
		for (int j = 97; j <97+26; j++)//97
		{
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j)
				{
					System.out.print(ini.charAt(i));
				}
			}
		}
		System.out.println();
	}
	public void a2()
	{
		for (int j = 65; j < 65+26; j++)//97
		{
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j || (int)ini.charAt(i) == j+32)
				{
					System.out.print(ini.charAt(i));
				}
			}
		}
		System.out.println();
	}
	public void a3()
	{
		for (int j = 65; j < 65+26; j++)//97
		{
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j)
				{
					System.out.print(ini.charAt(i));
				}
			}
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j+32)
				{
					System.out.print(ini.charAt(i));
				}
			}
		}
		System.out.println();
	}
	public void a4()
	{
		String k = "";
		for (int j = 65; j < 65+26; j++)//97
		{
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j)
				{
					k = ini.charAt(i)+k;
				}
			}
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j+32)
				{
					k = ini.charAt(i)+k;
				}
			}
		}
		System.out.println(k);
	}
	public void a5()
	{
		for(int i = 0; i < ini.length();i++)
		{
			if ((int)(ini.charAt(i))<48||57<(int)ini.charAt(i)&&(int)ini.charAt(i)<65||(65+25)<(int)ini.charAt(i)&&(int)ini.charAt(i)<97||(int)ini.charAt(i)>(97+25))
			{
				System.out.print(ini.charAt(i));
			}
		}
		for (int k = 48; k <=57;k++ )
		{	
			for(int i = 0; i < ini.length();i++)
			{
				if ((int)ini.charAt(i)==k)
				{
					System.out.print(ini.charAt(i));
				}
			}
		}
		for (int j = 65; j < 65+26; j++)//97
		{
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j)
				{
					System.out.print(ini.charAt(i));
				}
			}
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j+32)
				{
					System.out.print(ini.charAt(i));
				}
			}
		}
		/*
		for (int j = 65; j < 65+26; j++)//97
		{
			for (int i = 0; i < ini.length(); i++)
			{
				if ((int)ini.charAt(i)==j || (int)ini.charAt(i) == j+32)
				{
					System.out.print(ini.charAt(i));
				}
			}
		} 
		*/
		System.out.println();
	}
	public void bonus()
	{
		int arr[] = new int[255];
		int max = 0;
		for (int i = 0; i < ini.length(); i++)
		{
			arr[(int)ini.charAt(i)]++;
		}
		for (int d = 0;d < 255; d++)
		{
			if (arr[d]> max) 
			{
				max = arr[d];
			}
		}
		for (int j = max; j > 0; j--)
		{
			for (int k = 0; k < 255; k++)
			{
				if (arr[k]==j)
				{
					for (int c = 1; c <= j; c++)
					{
						System.out.print((char)k);
					}
				}
			}	
		} 
	}
}
