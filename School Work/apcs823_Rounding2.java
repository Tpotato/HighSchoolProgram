package HW;
import java.util.*;
public class apcs823_Rounding2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		String first[] = kb.nextLine().split("");
		int dec = kb.nextInt();
		int stop = -1, negative = 0;
		int second[] = new int[first.length];
		int start = 0,star = 0;
		String arr[] = new String[first.length+1];
		int length = arr.length-1;
		arr[arr.length-1]= "";
		if (first[0].equals("-"))
		{
			negative = 1;
			arr[arr.length-2]="";
			for (int count = arr.length-1; count>1; count--)
			{
				arr[count-2] = first[count-1];
			}
			length-=1;
		}
		else 
		{
			for (int count = 0; count < first.length; count++)
			{
				arr[count] = first[count];
			}
		}
		for (int count = 0; count < length; count++)
		{
			if (arr[count].equals(".")) 
			{
				stop = count;
			}
			if (arr[count].equals("0") || arr[count].equals("."))
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
		if (dec ==2 && dec==stop+1 && !arr[0].equals("0")) start -=1;
		if (arr[dec+start].equals("."))
		{
			if (Integer.parseInt(arr[dec+1+start])>=5)
			{
				arr[dec-1+start] = ""+(Integer.parseInt(arr[dec-1+start])+1);
				arr[dec+1+start] = "0";
			}
		}
		else
		{
			if (stop!=-1 && stop < (dec+start))
			{
				if (Integer.parseInt(arr[dec+1+start])>=5)
				{						
					arr[dec+start] = ""+(Integer.parseInt(arr[dec+start])+1);
					arr[dec+1+start] = "0";
				}
			}
			else
			{
				if (Integer.parseInt(arr[dec+start])>=5)					
				{
					arr[dec-1+start] = ""+(Integer.parseInt(arr[dec-1+start])+1);
					arr[dec+start] = "0";
				}
			}
		}	
		for (int count = length-1; count > 0; count--)
		{
			if (arr[count].equals("."))
			{
				arr[count] = arr[count];
			}
			else if (Integer.parseInt(arr[count]) > 9)
			{
					if (arr[count-1].equals("."))
					{	
						arr[count-2]=""+(Integer.parseInt(arr[count-2])+1);
						arr[count] = ""+(Integer.parseInt(arr[count])%10);
					}
					else
					{
						arr[count-1]=""+(Integer.parseInt(arr[count-1])+1);
						arr[count] = ""+(Integer.parseInt(arr[count])%10);
					}
			}
		}
		if (Integer.parseInt(arr[0])>9)
		{
			for (int count = length; count > 1; count--)
			{
				arr[count] = arr[count-1];
			}
			arr[1] =""+(Integer.parseInt(arr[0])%10);
			arr[0] = "1";
			dec+=1;
		}
		for(int num = 0; num <= length; num++) /*num<length*/
		{
			if (num==stop && num<(dec+start))	
			{
				dec++;
			}
			if (stop == -1)
			{
				if (num>(dec-1) && !arr[num].equals("")) //fuck this shit u mother fucker
				{
				arr[num] = "0";
				}
				
			}
			else if (num>(dec-1+start))
			{
				if (num < stop) arr[num]="0";
				if (num > stop) arr[num]="";
				if (stop==dec) arr[stop]="";
			}
		}
		if (negative == 1)
		{
			for (int count = length+1; count > 0; count--)
			{
				arr[count] = arr[count-1];
			}
			arr[0] = "-";
		}
		for (int count = 0; count <= arr.length-1; count++)
		{
			if (!arr[count].equals(null))
			{
				System.out.print(arr[count]);
			}
		}
	}
}