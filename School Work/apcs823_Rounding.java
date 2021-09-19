package HW;
import java.util.*;

public class apcs823_Rounding 
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String arr[] = kb.nextLine().split("");
		int dec = kb.nextInt();
		int stop = -1;
		int second[] = new int[arr.length];
		int start = 0,star = 0;
		for (int count = 0; count < arr.length; count++)
		{
			if (arr[count].equals(".")) 
			{
				stop = count;
			}
			if (arr[count].equals("-") || arr[count].equals("0") || arr[count].equals("."))
			{
				second[count] = 0;
			}
			else 
			{
			second[count] = count;
			}
		}
		for (int count = 0; count<second.length && star==0; count++)
		{
			star = second[count];
			start = count;
		}
		start-=1;
		if (!arr[0].equals("-"))
		{
			if (arr[dec+start].equals("."))
			{
				if (Integer.parseInt(arr[dec+1+start])>=5)
				{
					arr[dec-1+start] = ""+(Integer.parseInt(arr[dec-1+start])+1);
				}
			}
			else
			{
				if (stop!=-1 && stop < (dec+start))
				{
					if (Integer.parseInt(arr[dec+1+start])>=5)
					{
						arr[dec+start] = ""+(Integer.parseInt(arr[dec+start])+1);
					}
				}
				else
				{
					if (Integer.parseInt(arr[dec+start])>=5)
					{
						arr[dec-1+start] = ""+(Integer.parseInt(arr[dec-1+start])+1);
					}
				}
			}
			for(int num = 0; num < arr.length; num++)
			{
				if (num==stop && num<(dec+start))
				{
					dec++;
				}
				if (stop == -1)
				{
					if (num>(dec-1)) arr[num] = "0";
				}
				else if (num>(dec-1+start))
				{
					if (num < stop) arr[num]="0";
					if (num > stop) arr[num]="";
					if (stop==dec) arr[stop]="";
				}
				System.out.print(arr[num]);
			}
			
		}
		if (arr[0].equals("-"))
		{
			if (arr[1].equals("0") && arr[2].equals("."))
			{
				start-=1;
			}
			if (arr[dec+start+1].equals("."))
			{
				if (Integer.parseInt(arr[dec+1+start+1])>=5)
				{
					arr[dec-1+start+1] = ""+(Integer.parseInt(arr[dec-1+start+1])+1);
				}
			}
			else
			{
				if (stop!=-1 && stop < (dec+start+1))
				{
					if (Integer.parseInt(arr[dec+1+start+1])>=5)
					{
						arr[dec+start+1] = ""+(Integer.parseInt(arr[dec+start+1])+1);
					}
				}
				else
				{
					if (Integer.parseInt(arr[dec+start+1])>=5)
					{
						arr[dec-1+start+1] = ""+(Integer.parseInt(arr[dec-1+start+1])+1);
					}
				}
			}
			for(int num = 0; num < arr.length; num++)
			{
				if (num==stop && num<(dec+start+1))
				{
					dec++;
				}
				if (stop == -1)
				{
					if (num>dec) arr[num] = "0";
				}
				else if (num>(dec-1+start+1))
				{
					if (num < stop) arr[num]="0";
					if (num > stop) arr[num]="";
					if (stop==dec+1) arr[stop]="";
				}
				System.out.print(arr[num]);
			}
		}
	}
}
