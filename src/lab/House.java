package lab;

public class House {
	private int squareft;
	private double bathrooms;
	private int bedrooms;
	private int cost;
	private String address;
	private double lotsize;
	private boolean hasPool;
	private String image;
	
	
	//constructors
	public House(int squareft, double bathrooms, int bedrooms, int cost, String address, double lotsize, boolean hasPool, String image) {
		this.squareft = squareft;
		this.bathrooms = bathrooms;
		this.bedrooms = bedrooms;
		this.cost = cost;
		this.address = address;
		this.lotsize = lotsize;
		this.hasPool = hasPool;
		this.image = image;
	}
	
	//getter methods
	private int getSquareft() {return squareft; }
	private double getBathrooms() {return bathrooms; }
	private int getbedrooms() {return bedrooms; }
	private int getCost() {return cost; }
	private String getAddress() {return address; }
	private double getlotsize() {return lotsize; }
	private boolean getHasPool() {return hasPool; }
	private String getimage() {return image; }
	
	
	
	
	@Override
	public String toString() {
		return squareft+bathrooms+bedrooms+cost+address+lotsize+hasPool+image;
	}
}

