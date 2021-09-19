

public class triangle 
{
	double one = 1, two = 1, three = 1, s;
	public triangle(double side1, double side2, double side3)
	{
		one = side1;
		two = side2;
		three = side3;
	}
	public void sysa() 
	{
		s = (one+two+three)/2;
		System.out.println("Area is " + Math.sqrt(s*(s-one)*(s-two)*(s-three)));
	}
	public void sysp()
	{
		System.out.println("Perimeter is " + (one+two+three));
	}
	public void setSize(double side1, double side2, double side3)
	{
		one = side1;
		two = side2;
		three = side3;
	}
	
}
