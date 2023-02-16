package poc.sorting;

public class SelectionSort {

	public void sort(int[] arr) {
		
		for(int i=0; i < arr.length; i++) {
			int min_index = i;
			for(int j=i+1; j< arr.length; j++ ) {
				
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			System.out.println("i: "+ i + " | min: " + min_index);
			int temp= arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
			
		}
	}
}
