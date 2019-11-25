
public class Hangar {

	public static void main(String[] args) {
		// Car / Boat erstellen...
		Car car1 = new Car("", 0);
		car1.setBrand("Volkswagen");
		car1.setKilometers(180);

		
		Boat boat1 = new Boat("Sun Odysee", 12);
		// Boat ist die Klasse (Objekt ist immer mit einer Klasse assoziiert).
		
		
		System.out.println(car1.doStuff());
		System.out.println(boat1.doStuff());
		// ... zur Erinnerung...
		//System.out.println(car1.toString());

	}

}
