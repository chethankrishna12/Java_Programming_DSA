package numberseries;

public class CountDivisibleBy2and3 {

	public static void main(String[] args) {
		int no = 948216083;
		int count = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 == 0 && rem % 3 == 0) {
				count++;
			}
			no = no / 10;
		}
		System.out.println(count);
	}

}
