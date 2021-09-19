package HW;

public class apcs1206_Perfect_Square 
{
	public static void main(String [] args)//all c d e are even
	{
		recurse(3,2,1);
	}
	public static void recurse(int a, int c, int d)
	{
		System.out.println(a);
		if (checksquare(c*c+d*d-a*a)&&checksquare(a*a-d*d)&&checksquare(a*a-c*c))
		{
			System.out.println(((c*c+d*d)/2)+" "+(a*a-(c*c+d*d)/2)+" "+((c*c-d*d)/2));
		}
		else 
		{
			if (d<c-1)
			{
				d++;
				recurse(a,c,d);
			}
			else if (c<a-1)
			{
				c++;
				d=1;
				recurse(a,c,d);
			}
			else 
			{
				a++;
				c = 2;
				d = 1;
				recurse(a,c,d);
			}
		}
	}
	public static boolean checksquare(int d)
	{
		if (d==0) return false;
		double i = Math.sqrt((double)d);
		return i==(int)i;
	}
	/*public static void recurse(int a,int c,int d)
	{
		System.out.println(a+" "+c+" "+d);
		if (checksquare(a)&&checksquare(c)&&checksquare(d)&&checksquare(c+d-a)&&checksquare(a-d)&&checksquare(a-c))
		{
			System.out.println((c+d)/2+" "+(a-((c+d)/2))+" "+(c-d)/2);
		}
		else 
		{
			if (d<c-2)
			{
				d+=2;
				recurse(a,c,d);
			}
			else if (c<a-2)
			{
				c+=2;
				d=2;
				recurse(a,c,d);
			}
			else 
			{
				a+=2;
				c = 4;
				d = 2;
				recurse(a,c,d);
			}
		}
	}*/
	/*public static void recurse(int x, int y, int z)
	{
		System.out.println(x+""+y+""+z);
		if (checksquare(x+y)&&checksquare(x-y)&&checksquare(x+z)&&checksquare(x-z)&&checksquare(y+z)&&checksquare(y-z))
		{
			System.out.println(x+" "+y+" "+z);
		}
		else 
		{
			if (z<y-1)
			{
				z++;
				recurse(x,y,z);
			}
			else if (y<x-1)
			{
				y++;
				z=1;
				recurse(x,y,z);
			}
			else 
			{
				x++;
				y = 2;
				z = 1;
				recurse(x,y,z);
			}
		}
	}*/
}
