package HW;

public class apcs0121_Lines 
{
	public double length;
	public int startx;
	public int starty;
	public int endx;
	public int endy;
	public double slope;
	public apcs0121_Lines(int x1, int y1, int x2, int y2)
	{
		if (x1<x2) 
		{
			startx = x1;
			starty = y1;
			endx = x2;
			endy = y2;
		}
		else if (x1>x2)
		{
			startx = x2;
			starty = y2;
			endx = x1;
			endy = y1;
		}
		else
		{
			if(y1<y2)
			{
				startx = x1;
				starty = y1;
				endx = x2;
				endy = y2;
			}
			else
			{
				startx = x2;
				starty = y2;
				endx = x1;
				endy = y1;
			}
		}
		if ((double)(endx-startx)==0) slope = Integer.MAX_VALUE;
		else slope = (double)(endy-starty)/(endx-startx);
		length = (double)(Math.sqrt(Math.pow(endy-starty, 2)+Math.pow(endx-startx, 2)));
		
	}
	/*public boolean checkIfParallelAndSameLength(apcs0121_Lines another)
	{
		if (slope == another.slope&&length==another.length) return true;
		else return false;
	}*/
	public boolean checkIfRectangleWithTwoHorizontal(apcs0121_Lines another)
	{
		if (slope == another.slope&&slope==0&&length==another.length&&startx==another.startx) return true;
		else return false;
	}
	public boolean checkIfRectangleWithTwoVertical(apcs0121_Lines another)
	{
		if (slope == another.slope&&slope==Integer.MAX_VALUE&&length==another.length&&starty==another.starty) return true;
		else return false;
	}
	public boolean checkIfParallelAndSameLengthButNotRectangle(apcs0121_Lines another)
	{//endx!=another.startx&&endy!=another.starty&&
		if ((endx!=another.startx||endy!=another.starty)&&another.starty!=starty+(int)slope*(another.startx-startx)&&slope == another.slope&&length==another.length&&!(startx==another.startx&&starty==endy||starty==another.starty&&startx==endx)) return true;
		else return false;
	}
	public double getSlope()
	{
		return slope;
	}
}
