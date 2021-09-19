

public class Rings 
{
	private int id;
	private material mat;
	private double weight;
	private double size;
	private stone[] stones;
	private double production;
	public Rings(int id, material mat, double weight, double size, stone[] stones, double production)
	{
		this.id = id;
		this.mat = mat;
		this.weight = weight;
		this.size = size;
		this.stones = stones;
		this.production = production;
	}
	public int getid()
	{
		return id;
	}
	public material getmat()
	{
		return mat;
	}

	public double getCostofStones()
	{
		double cost = 0;
		for (int count = 0; count<stones.length;count++)
		{
			cost+=stones[count].getCost();
		}
		return cost;
	}
	public double getCost()
	{
		return weight*getmat().getcostperMG()+getCostofStones()+production;
	}
}
