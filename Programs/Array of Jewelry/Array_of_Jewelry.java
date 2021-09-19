
import java.util.*;
public class Array_of_Jewelry 
{
	ArrayList<Rings> ring= new ArrayList<Rings>();
	ArrayList<material> mat = new ArrayList<material>();
	ArrayList<stone> sto = new ArrayList<stone>();
	public Array_of_Jewelry(/*material material, double weight, double size, stone[] stones, double production*/)
	{
		//ring.add(new Rings(ring.size()+1, material, weight, size, stones, production));
	}
	public void addRing(int materialId, double weight, double size, int[] stonesId, double production)
	{
		stone[] stones = new stone[stonesId.length];
		for (int count = 0; count < stones.length; count++)
		{
			stones[count] = sto.get(stonesId[count]-1);
		}
		ring.add(new Rings(ring.size()+1, mat.get(materialId-1), weight, size, stones, production));	
	}
	public void addMaterials(String type, double density, double costperMG)
	{
		mat.add(new material(mat.size()+1, type, density, costperMG));
	}
	public void addStones(String type, String grade, double cost, double weight)
	{
		sto.add(new stone(sto.size()+1, type, grade, cost, weight));
	}
	public double calculateCostOfAllRing()
	{
		double cost = 0;
		for(int count = 0; count<ring.size(); count++)
		{
			cost+=ring.get(count).getCost();
		}
		return cost;
	}
	public double calculateAvgCostOfAllRing()
	{
		return calculateCostOfAllRing()/ring.size();
	}
	public double calculateCostOfRingOfSpecificId(int id)
	{
		return ring.get(id-1).getCost();
	}
	public double calculateCostOfRingsOfSpecificMaterial(int MaterialId)
	{
		double cost = 0;
		for (int count = 0; count < ring.size(); count++)
		{
			if (ring.get(count).getmat().equals(mat.get(MaterialId-1)))
			{
				cost+=ring.get(count).getCost();
			}
		}
		return cost;
	}
	public void listRingsbyPrice()
	{
		ArrayList<Rings> rings = ring;
		double max = 0;
		int maxid = -1;
		while(rings.size()>0)
		{	
		max = 0;
		for (int count = 0; count<rings.size();count++)
		{
			if (rings.get(count).getCost()>max)
			{
				max = rings.get(count).getCost();
				maxid = count;
			}
		}
		System.out.println(rings.get(maxid).getid());
		rings.remove(maxid);
		}
	}
	
}

