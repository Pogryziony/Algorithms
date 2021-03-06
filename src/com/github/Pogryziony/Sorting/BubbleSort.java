package com.github.Pogryziony.Sorting;

public class BubbleSort {

	// złożoność obliczeniowa czasowa: O(n^2)
	// złożoność pamięciowa: O(1)
	
	private Integer[] arr;
	
	public Integer[] bubbleSort(Integer[] table) {
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length-1; j++) {
				if (table[j]>table[j+1]) {
					int temp = table[j+1];
					table[j+1]=table[j];
					table[j]=temp;
				}
			}
		}
		arr = table;
		return arr;
	}
	public Integer[] getArr() {
		return arr;
	}

	
	
}
