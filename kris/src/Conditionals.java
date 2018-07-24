public class Conditionals {	
	public int add(int number1, int number2, boolean addition) {
		int answer=0;

		if(addition) {
			answer= number1 * number2;
		}else {
			answer=number1+number2;
		}
		return answer;
	}

}
