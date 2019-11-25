
public class Boat extends Vehicle {

	
	
	
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doStuff() {
		return "I am " + getBrand() + " and I will go glug glug!";
	}
	
}











/* löschen: Datem vom Internet
 * 
 * 
 * 
 * 
 * 
 

public class Car {
	
	//Attribute/Eigenschaften
	private String color; //Farbe
	private String brand; //Marke des Autos
	private int horsePower; // PS-Zahl
	// public bedeutet: Außerhalb der Klasse kann man auch zugreifen
	// privat: --> nur in classe Car aufrufbar!
	// man setzt die Attribute NIE auf public !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	// nun kommen Getter & Setter ins Spiel
	// von außen kontrolliert zugreifen...
	
	
	
	// standart Konstruktor: public Car() {}
		
	// nun können wir aber bereits Parameter übergeben...
	public Car(String color, String brand, int horsePower) {
		this.color = color; 
		// durch this.meinen wir vom Objekt das Attribut (von oben)
		// das color nach dem "=" ist die color, die beim Sting übergeben wurde: "Car(String color...".
		this.brand = brand;
		this.horsePower = horsePower;
		
		this.drive(); // was passieren soll, wenn ich eine Klasse definieren...
	}
	
	
	
	
	
	
	//Methoden
	// ... hier wurde static weggelassen... Methode in einer classe
	// ... dies passt zum car; Hausbauen ist hier nicht drin...
	public void drive() {
		System.out.println("Das Auto fährt...");
	}

	
	// Getter & Setter !!!!!!!!!!!!!!!!!!!!!!!!
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
}
*/

