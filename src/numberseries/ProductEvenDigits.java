package numberseries;

public class ProductEvenDigits {

	public static void main(String[] args) {
		int no = 948216083;
		int mul = 1;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				mul *= rem;
			}
			no = no / 10;
		}
		System.out.println(mul);
	}

}
