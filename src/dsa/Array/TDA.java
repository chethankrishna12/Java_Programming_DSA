package dsa.Array;

class Solution {
	int[][] arr;

	public Solution(int rsize, int csize) {
		arr = new int[rsize][csize];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	
	

//  						0        0        10
	public void insertion(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Value " + value + " inserted");
			} else {
				System.out.println("The cell is already filled");
			}
		} catch (Exception e) {
			System.out.println("Invalid row and col ");
		}
	}
	
	
	
	public void search_By_Value(int search_Value) {// 80
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == search_Value) {
					System.out.println("The value is present in the index of: " + row + " : " + col);
					return;
				}
			}
		}
		System.out.println("The value is not present");
	}
	
	
	
	
	public void delete_By_Value(int search_Value) {// 80
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == search_Value) {
					arr[row][col] = Integer.MIN_VALUE;
					return;
				}
			}
		}
		System.out.println("The value is not present");
	}
	
	
	
	
	
	public void traverse() {
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	
}

public class TDA {
	public static void main(String[] args) {
		Solution tda = new Solution(3, 3);
		tda.insertion(0, 0, 10);
		tda.insertion(0, 1, 20);
		tda.insertion(0, 2, 30);
		tda.insertion(1, 0, 40);
		tda.insertion(1, 1, 50);
		tda.insertion(1, 2, 60);
		tda.insertion(2, 0, 70);
		tda.insertion(2, 1, 80);
		tda.insertion(2, 2, 90);

		tda.insertion(1, 1, 100);

		tda.search_By_Value(80);
		tda.delete_By_Value(80);

		tda.traverse();
	}
}
