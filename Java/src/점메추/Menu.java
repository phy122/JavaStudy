package 점메추;

public class Menu {
	private String type;
	private String name;
	private double price;
	private double distance;
	
	public Menu(String type, String name, double price, double distance) {
		this.type = type;
		this.name = name;
		this.price = price;
		this.distance = distance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Menu [type=" + type + ", name=" + name + ", price=" + price + ", distance=" + distance + "]";
	}
	
	
	

}
