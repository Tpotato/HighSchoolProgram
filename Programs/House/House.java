

public class House 
{
	String address;
	double price;
	int size;
	boolean isSold;
	public House(String addres, double pric, int siz, boolean isSol)
	{
		address = addres;
		price = pric;
		size = siz;
		isSold = isSol;
	}
	public boolean equals(House hou)
	{
		boolean ting = false;
		if (address.equals(hou.address) && price == hou.price && size == hou.size && isSold == hou.isSold)
		{
			ting = true;
		}
		return ting;
	}
}
