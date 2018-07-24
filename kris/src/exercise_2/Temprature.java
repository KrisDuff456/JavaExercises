package exercise_2;

public class Temprature {
	
	public boolean temp(int temp1, boolean isSummer) {
	 	
		if(temp1 > 90) 
		{
			isSummer = true; 
			System.out.println(temp1 + " is Summer!");
		}
		
		if(temp1<90) 
		{
			isSummer = false;
			System.out.println(temp1 + " it is not summer yet!");
			
		}
		return isSummer;
	}
}
