package theGarage;

import org.junit.Test;

public class TestCar {
	@Test
	public void testType() {
		Car testType = new Car();
		testType.typeOfVehicle("Landcraft");
		assertEquals("Not a Land vehicle",testType.typeOfVehicle, "Landcraft" );
	}

}
