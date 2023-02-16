package poc.sorting;

import java.util.Arrays;

public class BubbleSort {

	int count=10;
	
	public void sort(int[] arr) {
		int temp;
		boolean notSwapped=false;
		
		for(int i=0; i< arr.length ; i++) {
			notSwapped = true;
			for(int j=0; j < arr.length-1-i; j++) {
				System.out.println(Arrays.toString(arr)+ " "+ arr[j]+ " "+ arr[j+1]);
				
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =  temp;
					notSwapped = false;
				}
			}
			if(notSwapped) break;
		}
		
	}
	
	
	private int returnCount() {
		return this.count;
	}
}
