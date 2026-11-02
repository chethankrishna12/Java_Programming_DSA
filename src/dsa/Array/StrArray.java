package dsa.Array;

public class StrArray {

	String[] arr;

	StrArray(int size) {
		arr = new String[size];
		System.out.println("Array Created");
	}

	public void insert(int index, String value) {
		try {
			if (arr[index] == null) {
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

	public void search_By_Value(String search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(search)) {
				System.out.println("Element is found at index" + i);
				return;
			}
		}
		System.out.println("value not found");
	}

	public void search_By_Index(int index) {
		try {
			if (arr[index] != null) {
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
			if (arr[index] != null) {
				arr[index] = null;
				System.out.println("the value is deleted");
			} else {
				System.out.println("the index value is empty");
			}
		} catch (Exception e) {
			System.out.println("Invalid Index");

		}
	}

} 
