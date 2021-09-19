

public class Perfect_Square2 
{
	public static void main(String [] args)
	{
		int d;
		for(int a=3; a<1000;a++)
		{
			for (int c = 2;c<a-1;c++)
			{
				/*for (int d = 1;d<c-1;d++)
				{
					if (checksquare(c*c+d*d-a*a)&&checksquare(a*a-d*d)&&checksquare(a*a-c*c))
					{
						System.out.println(((c*c+d*d)/2)+" "+(a*a-(c*c+d*d)/2)+" "+((c*c-d*d)/2));
					}
				}*/
				d=1;
				recurse(a, c, d);
			}
		}
	}
	public static boolean checksquare(int d)
	{
		if (d==0) return false;
		double i = Math.sqrt((double)d);
		return i==(int)i;
	}
	public static void recurse(int a, int c, int d)
	{
		if (checksquare(c*c+d*d-a*a)&&checksquare(a*a-d*d)&&checksquare(a*a-c*c))
		{
			System.out.println(((c*c+d*d)/2)+" "+(a*a-(c*c+d*d)/2)+" "+((c*c-d*d)/2));
		}
		else if (d==c-1)
		{
			return;
		}
		else
		{
			d++;
			recurse(a,c,d);
		}
	}
}