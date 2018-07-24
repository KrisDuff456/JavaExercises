public class conditionals2 {
	public int find(int number1, int number2, boolean subtract) {
		int answer=0;

		if (number1 != 0) {
			if(subtract) {
				answer= number1 + number2;
			}else  {
				answer=number1-number2;
			}

		}else {
			answer = number2;
		}
		return answer;
	}

}
