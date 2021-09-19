package HW;
import java.util.ArrayList;
public class apcs830_polygon 
{
	int nodes;
	double sum1 = 0, sum2 = 0, length = 0, product;
	public apcs830_polygon(int node)
	{
		nodes = node;
	}
	ArrayList list= new ArrayList();
	public void adding (double x, double y)
	{
		list.add(x);
		list.add(y);
	}
	public void sysa()
	{
		for (int count = 0; count < (list.size()); count++)
		{
			if (count%2==0)
			{
				if (count+2>=list.size())
				{
					sum1+=Double.parseDouble(list.get(count).toString())*Double.parseDouble(list.get(1).toString());
				}
				else
				{
					sum1+=Double.parseDouble(list.get(count).toString())*Double.parseDouble(list.get(count+3).toString());
				}
			}
			if (count%2==1)
			{
				if (count+2>=list.size())
				{
					sum2+=Double.parseDouble(list.get(count).toString())*Double.parseDouble(list.get(0).toString());
				}
				else
				{
					sum2+=Double.parseDouble(list.get(count).toString())*Double.parseDouble(list.get(count+1).toString());
				}
			}
		}
		if (((sum1-sum2)/2)<0)
		{
			product = (-1)*(sum1-sum2)/2;
		}
		else 
		{
		product = (sum1-sum2)/2;
		}
		sum1 = 0;
		sum2 = 0;
		System.out.println("Area is " + product);
	}
	public void sysp()
	{
		for (int count = 0; count < (list.size()/2); count++)
		{
			if (count == (list.size()/2)-1)
			{
			length+=Math.sqrt(Math.pow(Double.parseDouble(list.get(0).toString())-Double.parseDouble(list.get(2*count).toString()), 2)+Math.pow(Double.parseDouble(list.get(1).toString())-Double.parseDouble(list.get(2*count+1).toString()), 2));
			}
			else
			{
			length+=Math.sqrt(Math.pow((Double.parseDouble(list.get(2*count+2).toString())-Double.parseDouble(list.get(2*count).toString())), 2)+Math.pow((Double.parseDouble(list.get(2*count+3).toString())-Double.parseDouble(list.get(2*count+1).toString())), 2));
			}
		}
		System.out.println("Perimeter is " + length);
		length = 0;
	}
	public void syse(int node)
	{
		nodes = node;
		list.removeAll(list);
	}
}