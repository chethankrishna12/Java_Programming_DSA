package dsa.Sorting;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		int[] arr= {4,7,5,2,1,3,6};
		int i=0;
		while(i<arr.length) {
			int current=arr[i]-1;
			if(arr[i]!=arr[current]) {
				int temp=arr[i];
				arr[i]=arr[current];
				arr[current]=temp;
			}
			else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
