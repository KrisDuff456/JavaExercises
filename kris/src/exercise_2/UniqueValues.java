package exercise_2;
public class UniqueValues {
	public int find(int number1, int number2, int number3) {
	
		if(number1 == number2 && number1 == number3) 
		{
			return 0;
		}
		if (number2 == number3) {
		return number1;
		}
	    if(number3 == number1) {
	    	return number2;
	    	
	    };
        return number3;
}
}

