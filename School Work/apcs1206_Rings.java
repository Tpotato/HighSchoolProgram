package HW;

public class apcs1206_Rings 
{
	private int id;
	private apcs1206_material mat;
	private double weight;
	private double size;
	private apcs1206_stone[] stones;
	private double production;
	public apcs1206_Rings(int id, apcs1206_material mat, double weight, double size, apcs1206_stone[] stones, double production)
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
	public apcs1206_material getmat()
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
