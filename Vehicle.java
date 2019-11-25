
public abstract class Vehicle {
	//abstract bedeutet, dass wir es nicht von außen verändern können!
	// abstracte classe und eine nicht abstrakte methode: Das geht nicht!

	private String brand; // Marke
	private int kilometers; // Km

	// Konstruktor
	public Vehicle(String brand, int kilometers) {
		this.brand = brand;
		this.kilometers = kilometers;
		// this.xx means xx from above...
		// =xx means das Attribute, die dem String übergeben wurde: "Vehicle(String
		// brand...".
		// wo kann this.xx stehen? --> construktor, methode aber nicht in einer Statischen methode...
		

	}
	
	// getters & setters:

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getKilometers() {
		return kilometers;
	}

	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}

	
	//abstract methods
	public abstract String doStuff();
	
	
	
}
