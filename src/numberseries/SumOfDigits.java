/**
 * 
 */
package numberseries;

public class SumOfDigits {

	public static void main(String[] args) {
		int no = 64;
		int sum = 0;
		while(no!=0) {
			int rem=no%10;
			sum+=rem;
			no=no/10;
		}
		System.out.println(sum);
	}

}
