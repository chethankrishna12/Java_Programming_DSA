package numberseries;

public class ProductOfDigits {

	public static void main(String[] args) {
		int no = 64;
		int mul = 1;
		while(no!=0) {
			int rem=no%10;
			mul*=rem;
			no=no/10;
		}
		System.out.println(mul);
	}

}
