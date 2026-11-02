/**
 * 
 */
package numberseries;

public class SumEvenDigits {

	public static void main(String[] args) {
		int no = 64321;
		int sum = 0;
		while (no != 0) {
			int rem = no % 10;
			if (rem % 2 == 0) {
				sum += rem;
			}
			no = no / 10;
		}
		System.out.println(sum);
	}

}
