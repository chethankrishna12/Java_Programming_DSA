package leetcode;

public class CoinArrangement {

	public static void main(String[] args) {

		int n = 25;
		int low = 0;
		int high = n;

		while (low <= high) {
			int mid = low +(high - low) / 2;

			long coinNeeded = (long)mid * (mid + 1) / 2;

			if ( coinNeeded<n) {
				low = mid + 1;
			} else {
				
				high = mid - 1;
			}

		}
		System.out.println(high);

	}

}
