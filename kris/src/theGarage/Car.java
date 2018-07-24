package theGarage;

public class Car extends Vehicle {

	private String carType;
	public String name;
	public int carWheels;
	
	public Car(int noOfWheels, String typeOfVehicle, String name) {
		super(noOfWheels, typeOfVehicle, name);
		
	}

	int noOfWheels() {
		return carWheels;
	}

	String typeOfVehicle() {
		return vehicleType;
	}

	String name() {

		return name;
	}
}
