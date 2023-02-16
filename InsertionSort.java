package poc.sorting;

import java.util.Arrays;

public class InsertionSort {

	public void sort(int[] arr) {
		
		for(int i=1; i < arr.length; i++) {
			int currentValue = arr[i];
			int j= i-1;
			for(;j >=0 && currentValue < arr[j]; j--) {
				arr[j+1] = arr[j];
				System.out.println(Arrays.toString(arr)+ " "+j+" "+ currentValue);
			}
			arr[j+1]= currentValue;
			
		}
	}
}
