

public class material 
{
	private int id;
	private String type;
	private double density;
	private double costperMG;
	public material(int id, String type, double density, double costperMG)
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
