package theGarage;

public class Vehicle {
	
	//int iD;
	//int seat;
	//int cost;
	//int speed;
	  int noOfWheels;
	
	
	//String fuelType;
	String typeOfVehicle;
	String vehicleName;
	
	public Vehicle(int noWheels, String typeVehicle, String name) {
	
		this.vehicleName = name;
		this.typeOfVehicle = typeVehicle;
		this.noOfWheels = noWheels;
		
	}
	public String vehicleType() {
		if(noOfWheels == 4 || noOfWheels == 3 || noOfWheels == 2) {
			return "Landcraft";
		}
		  if(noOfWheels == 0){
			return "Watercraft";
		    }
	return typeOfVehicle;
	}
	
}
