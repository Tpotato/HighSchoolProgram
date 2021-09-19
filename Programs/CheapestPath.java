import java.util.ArrayList;
public class CheapestPath 
{
	public static void main(String[] args)
	{
		int n = 5;
		int arr[][] = new int[n][n];
		int shortest[][] = new int[n][n];
		String fromWhere[][] = new String[n][n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> liss = new ArrayList<Integer>();
		boolean havechange = true;
		for (int row = 0; row<n; row++)
		{
			for (int col = 0; col<n; col++)
			{
				arr[row][col] = (int)(Math.random()*201);
				if (arr[row][col]-100<=-100)
				System.out.print(arr[row][col]-100+"");
				else if ((arr[row][col]-100<=-10&&arr[row][col]-100>=-99)||arr[row][col]-100>=100)
				System.out.print(arr[row][col]-100+" ");
				else if ((arr[row][col]-100<=-1&&arr[row][col]-100>=-9)||(arr[row][col]-100>=10&&arr[row][col]-100<=99))
				System.out.print(arr[row][col]-100+"  ");
				else
				System.out.print(arr[row][col]-100+"   ");
			}
			System.out.println();
		}
		/*for (int row = 0; row<5; row++)
		{
			for (int col = 0; col<5; col++)
			{
					arr[row][col] = 1;
			}
		}*/
		for(int row = 0; row<n; row++)
		{
			for(int col = 0; col<n; col++)
			{
				shortest[row][col] = 100000;
			}
		}
		while(havechange)
		{
			havechange = false;
			for (int row = 0; row<n; row++)
			{
				for (int col = 0; col<n; col++)
				{
					if(row==0&&col==0||row==1&&col==0||row==0&&col==1)
					{
						shortest[0][0] = 0;
						shortest[0][1] = arr[0][0];
						shortest[1][0] = arr[0][0];
						fromWhere[1][0] = "up";
						fromWhere[0][1] = "left";
					}
					else if (row==n-1&&col==n-1)
					{
						if (shortest[row-1][col]+arr[row-1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row-1][col]+arr[row-1][col];
							fromWhere[row][col] = "up";
							havechange = true;
						}
						if (shortest[row][col-1]+arr[row][col-1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col-1]+arr[row][col-1];
							fromWhere[row][col] = "left";
							havechange = true;
						}
					}
					else if (row==n-1&&col==0)
					{
						if (shortest[row-1][col]+arr[row-1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row-1][col]+arr[row-1][col];
							fromWhere[row][col] = "up";
							havechange = true;
						}
						if (shortest[row][col+1]+arr[row][col+1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col+1]+arr[row][col+1];
							fromWhere[row][col] = "right";
							havechange = true;
						}
					}
					else if (row==0&&col==n-1)
					{
						if (shortest[row][col-1]+arr[row][col-1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col-1]+arr[row][col-1];
							fromWhere[row][col] = "left";
							havechange = true;
						}	
						if (shortest[row+1][col]+arr[row+1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row+1][col]+arr[row+1][col];
							fromWhere[row][col] = "down";
							havechange = true;
						}
						
					}
					else if (row==0&&(col>0&&col<n-1))
					{
						if (shortest[row][col-1]+arr[row][col-1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col-1]+arr[row][col-1];
							fromWhere[row][col] = "left";
							havechange = true;
						}
						if (shortest[row][col+1]+arr[row][col+1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col+1]+arr[row][col+1];
							fromWhere[row][col] = "right";
							havechange = true;
						}
						if (shortest[row+1][col]+arr[row+1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row+1][col]+arr[row+1][col];
							fromWhere[row][col] = "down";
							havechange = true;
						}
					}
					else if (row==n-1&&(col>0&&col<n-1))
					{
						if (shortest[row][col-1]+arr[row][col-1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col-1]+arr[row][col-1];
							fromWhere[row][col] = "left";
							havechange = true;
						}
						if (shortest[row-1][col]+arr[row-1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row-1][col]+arr[row-1][col];
							fromWhere[row][col] = "up";
							havechange = true;
						}
						if (shortest[row][col+1]+arr[row][col+1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col+1]+arr[row][col+1];
							fromWhere[row][col] = "right";
							havechange = true;
						}
					}
					else if (col==0&&(row>0&&row<n-1))
					{
						if (shortest[row-1][col]+arr[row-1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row-1][col]+arr[row-1][col];
							fromWhere[row][col] = "up";
							havechange = true;
						}
						if (shortest[row][col+1]+arr[row][col+1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col+1]+arr[row][col+1];
							fromWhere[row][col] = "right";
							havechange = true;
						}
						if (shortest[row+1][col]+arr[row+1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row+1][col]+arr[row+1][col];
							fromWhere[row][col] = "down";
							havechange = true;
						}
					}
					else if (col==n-1&&(row>0&&row<n-1))
					{
						if (shortest[row][col-1]+arr[row][col-1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col-1]+arr[row][col-1];
							fromWhere[row][col] = "left";
							havechange = true;
						}
						if (shortest[row-1][col]+arr[row-1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row-1][col]+arr[row-1][col];
							fromWhere[row][col] = "up";
							havechange = true;
						}
						if (shortest[row+1][col]+arr[row+1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row+1][col]+arr[row+1][col];
							fromWhere[row][col] = "down";
							havechange = true;
						}

					}
					else
					{
						if (shortest[row][col-1]+arr[row][col-1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col-1]+arr[row][col-1];
							fromWhere[row][col] = "left";
							havechange = true;
						}
						if (shortest[row-1][col]+arr[row-1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row-1][col]+arr[row-1][col];
							fromWhere[row][col] = "up";
							havechange = true;
						}
						if (shortest[row][col+1]+arr[row][col+1]<shortest[row][col])
						{
							shortest[row][col] = shortest[row][col+1]+arr[row][col+1];
							fromWhere[row][col] = "right";
							havechange = true;
						}
						if (shortest[row+1][col]+arr[row+1][col]<shortest[row][col])
						{
							shortest[row][col] = shortest[row+1][col]+arr[row+1][col];
							fromWhere[row][col] = "down";
							havechange = true;
						}

						
					}
					
				}
			}
		}
		for (int row = 0; row<5; row++)
		{
			for (int col = 0; col<5; col++)
			{
				System.out.print(fromWhere[row][col]);
			}
			System.out.println();
		}
		int x = n-1, y = n-1;
		while (x!=0||y!=0)
		{
			list.add(arr[y][x]-100);
			if (fromWhere[y][x].equals("left"))
			{
				x-=1;
			}
			else if (fromWhere[y][x].equals("right"))
			{
				x+=1;
			}
			else if (fromWhere[y][x].equals("up"))
			{
				y-=1;
			}
			else if (fromWhere[y][x].equals("down"))
			{
				y+=1;
			}
		}
		list.add(arr[0][0]-100);
		for (int i = list.size()-1; i >= 0; i--)
		{
			liss.add(list.get(i));
		}
		System.out.println(list);
		System.out.println(liss);
	}
}
