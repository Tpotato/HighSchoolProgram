package HW;

public class apcs1206_dataBase 
{
	public static void main(String[] args)
	{
		apcs1206_Array_of_Jewelry database = new apcs1206_Array_of_Jewelry();
		database.addMaterials("Gold", 99.9, 10);
		database.addMaterials("Silver", 50, 5);
		database.addMaterials("Steel", 80, 2);
		database.addStones("Diamond", "VVS1", 100, 0.3);
		database.addStones("Diamond", "VVS2", 90, 0.3);
		database.addStones("Diamond", "VVS1", 200, 0.5);
		database.addStones("Diamond", "VVS2", 150, 0.5);
		int[] one = {1,1,2};
		int [] two = {};
		database.addRing(1, 10, 12, one, 1000);
		database.addRing(2, 5, 10, two, 200);
		System.out.println(database.calculateCostOfAllRing());
		System.out.println(database.calculateAvgCostOfAllRing());
		System.out.println(database.calculateCostOfRingOfSpecificId(1));
		System.out.println(database.calculateCostOfRingsOfSpecificMaterial(2));
		database.listRingsbyPrice();

	}
}
