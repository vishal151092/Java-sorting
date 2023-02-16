package poc.sorting;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,12,-4,0,5,6,3};
		
//		int[] a1 =  Arrays.copyOfRange(arr, 0, 2);
//		int[] a2 = Arrays.copyOfRange(arr, 2, arr.length);
//		
//		//System.out.println(Arrays.toString(a1));
//		System.out.println(Arrays.toString(a2));
//		
		
		MergeSort mergeSort = new MergeSort();
		
		
		int[] data = mergeSort.sort(arr);
		
		System.out.println(Arrays.toString(data));
		
		
		
		
//		BubbleSort bubbleSort = new BubbleSort();
//		
//		bubbleSort.sort(arr);  //instance method
		
		//bubbleSort.returnCount();
		
//		SelectionSort selectionSort = new SelectionSort();
//		selectionSort.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		InsertionSort insertionSort = new InsertionSort();
//		insertionSort.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
//		int[] a1 = {1,4,6,8,9};
//		int[] a2 = {0,2,7,10};
//		mergeTwoSortedArrays(a1, a2);
	
		
		//Arrays.copyOfRange(a2, 0, )
	}

	
}
