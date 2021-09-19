package HW;

public class apcs1206_stone 
{
	private int id;
	private String type;
	private String grade;
	private double cost;
	private double weight;
	public apcs1206_stone(int id, String type, String grade, double cost, double weight)
	{
		this.id = id;
		this.type = type;
		this.grade = grade;
		this.cost = cost;
		this.weight = weight;
	}
	public double getCost()
	{
		return cost;
	}
}
