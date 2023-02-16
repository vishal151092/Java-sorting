package poc.sorting;

import java.util.Arrays;

public class MergeSort {

	
	public int[] sort(int[] arr) {
		
		if(arr.length <2) return arr;
		
		int mid = arr.length/2;
		
		int[] left= new int[mid]; //Arrays.copyOfRange(arr, 0, mid);
		
		int[] right= new int[arr.length-mid];
				// Arrays.copyOfRange(arr, mid, arr.length);
		
		for(int i=0; i<mid; i++) {
			left[i] = arr[i];
		}
		
		for(int j=mid; j<arr.length; j++) {
			right[j-mid] = arr[j]; 
		}
		
		return mergeTwoSortedArrays(sort(left),sort(right));
		
	}
	
	
	
	public int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length+arr2.length];
		
		int i=0, j =0, idx=0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				result[idx]= arr1[i];
				i++;
			}else {
				result[idx] = arr2[j];
				j++;
			}
			idx++;
		}
		while(i <arr1.length) {
			result[idx]=arr1[i];
			idx++;
			i++;
		}
		while(j <arr2.length) {
			result[idx]=arr2[j];
			idx++;
			j++;
		}
		
		return result;
		//System.out.println(Arrays.toString(result));
	}
}
