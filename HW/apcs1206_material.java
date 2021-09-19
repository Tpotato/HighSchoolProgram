package HW;

public class apcs1206_material 
{
	private int id;
	private String type;
	private double density;
	private double costperMG;
	public apcs1206_material(int id, String type, double density, double costperMG)
	{
		this.id = id;
		this.type = type;
		this.density = density;
		this.costperMG = costperMG;
	}
	public double getcostperMG()
	{
		return costperMG;
	}
}
