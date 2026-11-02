package numberseries;

public class SumDivisibleBy9 {

	public static void main(String[] args) {
		int no = 948216083;
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 9 == 0 ) {
				sum+=rem;
			}
			no = no / 10;
		}
		System.out.println(sum);
	}

}
