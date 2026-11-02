package numberseries;

public class CountOddDigits {

	public static void main(String[] args) {
		int no = 948216083;
		int count = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 != 0) {
				count++;
			}
			no = no / 10;
		}
		System.out.println(count);
	}

}
