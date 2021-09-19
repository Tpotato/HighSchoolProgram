package HW;
import java.util.*;
public class apcs1206_Array_of_Jewelry 
{
	ArrayList<apcs1206_Rings> ring= new ArrayList<apcs1206_Rings>();
	ArrayList<apcs1206_material> mat = new ArrayList<apcs1206_material>();
	ArrayList<apcs1206_stone> sto = new ArrayList<apcs1206_stone>();
	public apcs1206_Array_of_Jewelry(/*apcs1206_material material, double weight, double size, apcs1206_stone[] stones, double production*/)
	{
		//ring.add(new apcs1206_Rings(ring.size()+1, material, weight, size, stones, production));
	}
	public void addRing(int materialId, double weight, double size, int[] stonesId, double production)
	{
		apcs1206_stone[] stones = new apcs1206_stone[stonesId.length];
		for (int count = 0; count < stones.length; count++)
		{
			stones[count] = sto.get(stonesId[count]-1);
		}
		ring.add(new apcs1206_Rings(ring.size()+1, mat.get(materialId-1), weight, size, stones, production));	
	}
	public void addMaterials(String type, double density, double costperMG)
	{
		mat.add(new apcs1206_material(mat.size()+1, type, density, costperMG));
	}
	public void addStones(String type, String grade, double cost, double weight)
	{
		sto.add(new apcs1206_stone(sto.size()+1, type, grade, cost, weight));
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
		ArrayList<apcs1206_Rings> rings = ring;
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

