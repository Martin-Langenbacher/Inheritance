
public class Car extends Vehicle {
	
	

	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String doStuff() {
		return "I am " + getBrand() + " and I will go zoom zoom zoom!";
	}
	
}
