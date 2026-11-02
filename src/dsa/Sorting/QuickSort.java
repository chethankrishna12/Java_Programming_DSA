package dsa.Sorting;

import java.util.Arrays;

public class QuickSort {
	
public static int getPivote(int[] arr,int li,int hi) {
		int pivote=hi;
		int j=li-1;
		for(int i=li;i<=hi;i++) {
			if(arr[i]<=arr[pivote]) {
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		return j;
	}
	
	
	public static void quicksort(int[] arr,int li,int hi) {
		if(li<hi) {
			int pivote=getPivote(arr, li, hi);
			quicksort(arr, li, pivote-1);
			quicksort(arr,  pivote+1,hi);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 45, 32, 8, 75, 41, 11, 33, 25 };
		System.out.println(Arrays.toString(arr));
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
