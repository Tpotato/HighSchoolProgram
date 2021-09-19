package HW;
import java.util.*;
public class apsc0121_Parallelograms 
{
	public static void main(String[] args)
	{
		//int n = 4;
		//boolean[][] array = new boolean[5][7];
		boolean[][] array = {{false,false,false,true,false,false,false},{false,true,false,false,false,false,false},{true,false,true,false,false,false,true},{true,true,true,false,false,false,false},{true,true,true,false,false,false,true}}; 
		/*boolean[][] array = 
		{{false,true,false,false,false,false,false,false,false,false,false,false}
		,{false,false,false,false,false,false,false,false,false,false,false,false}
		,{false,false,false,false,false,false,false,false,false,false,false,false}
		,{false,false,false,true,false,false,false,false,false,false,false,false}
		,{false,false,true,false,false,false,false,false,false,false,false,false}
		,{false,false,false,false,false,false,false,false,false,false,false,false}
		,{false,false,false,false,false,false,false,false,false,false,true,false}
		,{false,false,false,false,false,false,false,false,false,true,false,false}
		,{false,false,false,false,false,false,false,false,false,false,false,false}
		,{false,false,false,false,false,false,false,false,false,false,false,false}
		,{false,false,false,false,false,false,false,false,false,false,false,true}
		,{false,false,false,false,false,false,false,false,false,false,true,false}};*/
		char[][] cha = new char[array.length][array[0].length];
		ArrayList<apcs0121_Lines> lines= new ArrayList<apcs0121_Lines>();
		int total = 0,total2 = 0;
		for (int r = 0; r < array.length; r++)
		{
			for (int c = 0; c < array[r].length; c++)
			{
				System.out.print(array[r][c]);
				if (array[r][c]) cha[r][c] = '*';
				else cha[r][c] = "□".charAt(0);
			}
			System.out.println();
		}
		for (int r = 0; r < array.length; r++)
		{
			for (int c = 0; c < array[r].length; c++)
			{
				System.out.print(cha[r][c]+" ");
			}
			System.out.println();
		}  //SHOW THE CHARACTER CHART
		
		
		//we go through col cuz ezier   FIND LINES
		for (int c = 0; c < array[0].length; c++)
		{
			for (int r = 0; r < array.length; r++)
			{
				if (array[r][c])
				{
					for (int c1 = 0; c1 < array[0].length; c1++)
					{
						for (int r1 = 0; r1 < array.length; r1++)
						{
							if (array[r1][c1]&&!(r==r1&&c==c1))lines.add(new apcs0121_Lines(c,r,c1,r1));
						}
					}
				}
			}
		}
		//Delete repeating lines
		for (int c = 0; c < lines.size()-1;c++)
		{
			for (int c1 = c+1; c1 < lines.size();c1++)
			{
				if (lines.get(c).endx==lines.get(c1).endx && lines.get(c).endy==lines.get(c1).endy&&lines.get(c).startx==lines.get(c1).startx&&lines.get(c).starty==lines.get(c1).starty)
				{
					lines.remove(c1);
					c1--;
				}
			}

		}
		//output list of lines
		/*for (int c = 0; c < lines.size();c++)
		{
			System.out.println(lines.get(c).startx+""+lines.get(c).starty+""+lines.get(c).endx+""+lines.get(c).endy);
		}*/
		/*int ch =26; //CHECK CERTAIN LINES' DATA
		int ch1 = 5;
		System.out.println(lines.get(ch).getSlope()+""+lines.get(ch).startx+""+lines.get(ch).starty+""+lines.get(ch).endx+""+lines.get(ch).endy+""+lines.get(ch).length);
		System.out.println(lines.get(ch1).getSlope()+""+lines.get(ch1).startx+""+lines.get(ch1).starty+""+lines.get(ch1).endx+""+lines.get(ch1).endy+""+lines.get(ch1).length);
		System.out.println(lines.get(ch1).getSlope()==lines.get(ch).getSlope());
		System.out.println(lines.get(5).checkIfRectangleWithTwoHorizontal(lines.get(26)));*/
		
		//Find the PARALLELOGRAMS
		//RECTANGLE
		for (int c = 0; c < lines.size()-1;c++)
		{
			for (int c1 = c+1; c1 < lines.size();c1++)
			{
				if (lines.get(c).checkIfRectangleWithTwoHorizontal(lines.get(c1)))
				{
					total ++;
					cha[lines.get(c).starty][lines.get(c).startx] = '┌';
					cha[lines.get(c).endy][lines.get(c).endx] = '┐';
					cha[lines.get(c1).starty][lines.get(c1).startx] = '└';
					cha[lines.get(c1).endy][lines.get(c1).endx] = '┘';
					for (int count = lines.get(c).startx+1; count < lines.get(c).endx;count++)
					{
						cha[lines.get(c).starty][count] = '-';
					}
					for (int count = lines.get(c1).startx+1; count < lines.get(c1).endx;count++)
					{
						cha[lines.get(c1).starty][count] = '-';
					}
					for (int count = lines.get(c).starty+1; count < lines.get(c1).starty;count++)
					{
						cha[count][lines.get(c).startx] = '|';
					}
					for (int count = lines.get(c).endy+1; count < lines.get(c1).endy;count++)
					{
						cha[count][lines.get(c1).endx] = '|';
					}
				}
			}
		}
		/*for (int c = 0; c < lines.size()-1;c++)
		{
			for (int c1 = c+1; c1 < lines.size();c1++)
			{
					if (lines.get(c).checkIfRectangleWithTwoVertical(lines.get(c1)))
					{
						//total++;
						cha[lines.get(c).starty][lines.get(c).startx] = '┌';
						cha[lines.get(c).endy][lines.get(c).endx] = '└';
						cha[lines.get(c1).starty][lines.get(c1).startx] = '┐';
						cha[lines.get(c1).endy][lines.get(c1).endx] = '┘';
						for (int count = lines.get(c).starty+1; count < lines.get(c).endy;count++)
						{
							cha[count][lines.get(c).startx] = '|';
						}
						for (int count = lines.get(c1).starty+1; count < lines.get(c1).endy;count++)
						{
							cha[count][lines.get(c1).startx] = '|';
						}
						for (int count = lines.get(c).startx+1; count < lines.get(c1).startx;count++)
						{
							cha[lines.get(c).starty][count] = '-';
						}
						for (int count = lines.get(c).endx+1; count < lines.get(c1).endx;count++)
						{
							cha[lines.get(c1).endy][count] = '-';
						}
					}
			}
		}*/
		//OTHER SHAPES
		for (int c = 0; c < lines.size()-1;c++)
		{
			for (int c1 = c+1; c1 < lines.size();c1++)
			{
					if (lines.get(c).checkIfParallelAndSameLengthButNotRectangle(lines.get(c1)))
					{//lines.get(c).startx   lines.get(c).starty   lines.get(c).endx   lines.get(c).endy
						if (lines.get(c).startx == lines.get(c).endx)
						{
							total++;
							if (lines.get(c).starty<lines.get(c1).starty)//Y smaller means higher
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '^';
								cha[lines.get(c).endy][lines.get(c).endx] = '<';
								cha[lines.get(c1).starty][lines.get(c1).startx] = '>';
								cha[lines.get(c1).endy][lines.get(c1).endx] = 'v';
								for (int count = lines.get(c).startx+1; count < lines.get(c1).startx;count++)
								{
									cha[lines.get(c).starty+(count*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count]= '\\';
								}
								for (int count = lines.get(c).endx+1; count < lines.get(c1).endx;count++)
								{
									cha[lines.get(c).endy+(count*(lines.get(c1).endy-lines.get(c).endy))/((int)(lines.get(c1).endx-lines.get(c).endx))][count]= '\\';
								}
							}
							else if (lines.get(c).starty>lines.get(c1).starty)
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
								cha[lines.get(c).endy][lines.get(c).endx] = 'v';
								cha[lines.get(c1).starty][lines.get(c1).startx] = '^';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
								for (int count = lines.get(c).startx+1; count < lines.get(c1).startx;count++)
								{
									cha[lines.get(c).starty+(count*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count]= '/';
								}
								for (int count = lines.get(c).endx+1; count < lines.get(c1).endx;count++)
								{
									cha[lines.get(c).endy+(count*(lines.get(c1).endy-lines.get(c).endy))/((int)(lines.get(c1).endx-lines.get(c).endx))][count]= '/';
								}
							}
							for (int count = lines.get(c).starty+1; count < lines.get(c).endy;count++)
							{
								cha[count][lines.get(c).startx] = '|';
							}
							for (int count = lines.get(c1).starty+1; count < lines.get(c1).endy;count++)
							{
								cha[count][lines.get(c1).startx] = '|';
							}
						}
						else if (lines.get(c).starty == lines.get(c).endy)
						{
							total++;
							if (lines.get(c).starty<lines.get(c1).starty)//Y smaller means higher
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
								cha[lines.get(c).endy][lines.get(c).endx] = '^';
								cha[lines.get(c1).starty][lines.get(c1).startx] = 'v';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
								for (int count = lines.get(c).startx+1; count < lines.get(c1).startx;count++)
								{
									cha[lines.get(c).starty+(count*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count]= '\\';
								}
								for (int count = lines.get(c).endx+1; count < lines.get(c1).endx;count++)
								{
									cha[lines.get(c).endy+(count*(lines.get(c1).endy-lines.get(c).endy))/((int)(lines.get(c1).endx-lines.get(c).endx))][count]= '\\';
								}
							}
							else if (lines.get(c).starty>lines.get(c1).starty)
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
								cha[lines.get(c).endy][lines.get(c).endx] = 'v';
								cha[lines.get(c1).starty][lines.get(c1).startx] = '^';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
								for (int count = lines.get(c).startx+1; count < lines.get(c1).startx;count++)
								{
									cha[lines.get(c).starty+(count*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count]= '/';
								}
								for (int count = lines.get(c).endx+1; count < lines.get(c1).endx;count++)
								{
									cha[lines.get(c).endy+(count*(lines.get(c1).endy-lines.get(c).endy))/((int)(lines.get(c1).endx-lines.get(c).endx))][count]= '/';
								}
							}
							for (int count = lines.get(c).startx+1; count < lines.get(c).endx;count++)
							{
								cha[lines.get(c).starty][count] = '-';
							}
							for (int count = lines.get(c1).startx+1; count < lines.get(c1).endx;count++)
							{
								cha[lines.get(c1).starty][count] = '-';
							}
						}
						/*else if (lines.get(c).startx == lines.get(c1).startx)
						{
							//total++;
							if(lines.get(c).getSlope()<0)                                                   //POTENTIAL PROBLEM HERE
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
								cha[lines.get(c).endy][lines.get(c).endx] = '^';
								cha[lines.get(c1).starty][lines.get(c1).startx] = 'v';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
							}
							else if(lines.get(c).getSlope()>0) 
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '^';
								cha[lines.get(c).endy][lines.get(c).endx] = '>';
								cha[lines.get(c1).starty][lines.get(c1).startx] = '<';
								cha[lines.get(c1).endy][lines.get(c1).endx] = 'v';
							}
						}
						else if (lines.get(c).starty == lines.get(c1).starty)
						{
							//total++;
							if(lines.get(c).getSlope()<0)                                                   //POTENTIAL PROBLEM HERE
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
								cha[lines.get(c).endy][lines.get(c).endx] = '^';
								cha[lines.get(c1).starty][lines.get(c1).startx] = 'v';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
							}
							else if(lines.get(c).getSlope()>0) 
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
								cha[lines.get(c).endy][lines.get(c).endx] = '^';
								cha[lines.get(c1).starty][lines.get(c1).startx] = 'v';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
							}
						}*/
						else if(lines.get(c).startx!=lines.get(c1).startx&&lines.get(c1).starty!=lines.get(c).starty)
						{    //lines.get(c).start  is the dot with least y value
							total2++;
							if (lines.get(c).starty<lines.get(c1).starty&&lines.get(c).starty<lines.get(c1).endy&&lines.get(c).starty<lines.get(c).endy)
							{
								cha[lines.get(c).starty][lines.get(c).startx] = '^';
								cha[lines.get(c1).endy][lines.get(c1).endx] = 'v';
								if (lines.get(c1).starty>lines.get(c).starty+lines.get(c).slope*(lines.get(c1).startx-lines.get(c).startx))
								{
									cha[lines.get(c).endy][lines.get(c).endx] = '>';
									cha[lines.get(c1).starty][lines.get(c1).startx] = '<';
								}
								else 
								{
									cha[lines.get(c).endy][lines.get(c).endx] = '<';
									cha[lines.get(c1).starty][lines.get(c1).startx] = '>';
								}
							}
							else if (lines.get(c1).starty<lines.get(c).starty&&lines.get(c1).starty<lines.get(c).endy&&lines.get(c1).starty<lines.get(c1).endy)
							{
								cha[lines.get(c1).starty][lines.get(c1).startx] = '^';
								cha[lines.get(c).endy][lines.get(c).endx] = 'v';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
							}
							else if (lines.get(c).endy<lines.get(c1).starty&&lines.get(c).endy<lines.get(c1).endy&&lines.get(c).endy<lines.get(c).starty)
							{
								cha[lines.get(c).endy][lines.get(c).endx] = '^';
								cha[lines.get(c1).starty][lines.get(c1).startx] = 'v';
								cha[lines.get(c).starty][lines.get(c).startx] = '<';
								cha[lines.get(c1).endy][lines.get(c1).endx] = '>';
							}
							else if (lines.get(c1).endy<lines.get(c1).starty&&lines.get(c1).endy<lines.get(c).endy&&lines.get(c1).endy<lines.get(c).starty)
							{
								cha[lines.get(c1).endy][lines.get(c1).endx] = '^';
								cha[lines.get(c).starty][lines.get(c).startx] = 'v';
								if (lines.get(c1).starty>lines.get(c).starty+lines.get(c).getSlope()*(lines.get(c1).startx-lines.get(c).startx))
								{
									cha[lines.get(c1).starty][lines.get(c1).startx] = '>';
									cha[lines.get(c).endy][lines.get(c).endx] = '<';
								}
								else
								{
									cha[lines.get(c1).starty][lines.get(c1).startx] = '<';
									cha[lines.get(c).endy][lines.get(c).endx] = '>';
								}
							}
							if (lines.get(c).getSlope()>0)
							{
								for (int count = lines.get(c).startx+1; count<lines.get(c).endx; count++)
								{
									cha[lines.get(c).starty+(int)(count*lines.get(c).getSlope())][count] = '\\';
								}
								for (int count = lines.get(c1).startx+1; count<lines.get(c1).endx; count++)
								{
									cha[lines.get(c1).starty+(int)((count-lines.get(c1).startx)*lines.get(c1).getSlope())][count] = '\\';
								}
							}
							else 
							{
								for (int count = lines.get(c).startx+1; count<lines.get(c).endx; count++)
								{
									cha[lines.get(c).starty+(int)(count*lines.get(c).getSlope())][count] = '/';
								}
								for (int count = lines.get(c1).startx+1; count<lines.get(c1).endx; count++)
								{
									cha[lines.get(c1).starty+(int)(count*lines.get(c1).getSlope())][count] = '/';
								}
							}
							if ((lines.get(c1).starty-lines.get(c).starty)/(lines.get(c1).startx-lines.get(c).startx)>0)
							{
								for (int count = lines.get(c).startx+1;count<lines.get(c1).startx;count++)
								{
									cha[lines.get(c).starty+(count*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count] = '\\';
								}
								for (int count = lines.get(c).endx+1;count<lines.get(c1).endx;count++)
								{
									cha[lines.get(c).endy+((count-lines.get(c).endx)*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count] = '\\';
								}
							}
							else
							{
								for (int count = lines.get(c).startx+1;count<lines.get(c1).startx;count++)
								{
									cha[lines.get(c).starty+(count*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count] = '\\';
								}
								for (int count = lines.get(c).endx+1;count<lines.get(c1).endx;count++)
								{
									cha[lines.get(c).endy+(count*(lines.get(c1).starty-lines.get(c).starty))/((int)(lines.get(c1).startx-lines.get(c).startx))][count] = '\\';
								}
							}
						}
					}
			}
		}
		total+=total2/2;
		System.out.println(total);
		//FINAL OUTPUT
		for (int r = 0; r < cha.length; r++)
		{
			for (int col = 0; col < cha[r].length; col++)
			{
				System.out.print(cha[r][col]+" ");
			}
			System.out.println();
		}
	}
}

