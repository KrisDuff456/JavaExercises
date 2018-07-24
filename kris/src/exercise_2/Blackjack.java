package exercise_2;

public class Blackjack {
	public int number(int firstNum, int secondNum) {
	 int first = Math.abs(firstNum - 21); 
	 int second = Math.abs(secondNum - 21); 
	 
		if(first < second && firstNum <= 21) {
			return firstNum;
		}
		if(second < first && secondNum <= 21) {
		    return secondNum ; 
	 }
		return 0;
	}
}
