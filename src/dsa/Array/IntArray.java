package dsa.Array;

public class IntArray {
	int[] arr;

	IntArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
		System.out.println("Array Created");
		
	}

	public void insert(int index, int value) {
		try {
			if (arr[index] == Integer.MIN_VALUE) {
				arr[index] = value;
				System.out.println("The value is inserted");
			} else {
				System.out.println("The index is already occupied");
			}
		} catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}

	public void traversal() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void search_By_Value(int search) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==search) {
				System.out.println("Element is found at index"+i);
				return;
			}
		}
		System.out.println("value not found");
	}
	
	public void search_By_Index(int index) {
		try {
			if (arr[index] != Integer.MIN_VALUE) {
				System.out.println("the value present in that index is" + arr[index]);
			} else {
				System.out.println("the index value is empty");
			}
		} catch (Exception e) {
			System.out.println("Invalid Index");
		}
	}

	
	
	public void delete_By_Index(int index) {
		try {
			if (arr[index] != Integer.MIN_VALUE) {
				arr[index] = Integer.MIN_VALUE;
				System.out.println("the value is deleted");
			} else {
				System.out.println("the index value is empty");
			}
		} catch (Exception e) {
			System.out.println("Invalid Index");

		}
	}
	
	public void delete_By_Value(int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				arr[i]=Integer.MIN_VALUE;
				System.out.println("The Value got deleted");
			}
		}
		System.out.println("The value not found");
	}
	
	public void delete() {
		arr=null;
		System.out.println("array is deleted");
	}
	
	

}
