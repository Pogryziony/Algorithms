package com.github.Pogryziony.Sorting;


//Time Complexity: O(n*2)
//Auxiliary Space: O(1)
public class InsertionSort {
private int[] array;
	public static int[] insertionSort(int[] array) {
		int key;
		int i;
		int j;
		for (i = 1;  i < array.length; i++) {
			key = array[i];
			j = i-1;
			
			 /* Move elements of array, that are  
	        greater than key, to one position ahead  
	        of their current position */
			
			while(j >=0 && array[j] > key) {
				array[j+1] = array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
		
		return array;
	}
	
	public int[] getArray() {
		return array;
	}

	
}
