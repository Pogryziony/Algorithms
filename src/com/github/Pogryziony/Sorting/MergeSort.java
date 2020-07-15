package com.github.Pogryziony.Sorting;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

/* Time complexity O(nLogn)
 * Auxiliary Space: O(n)
 * Algorithmic Paradigm: Divide and Conquer
 * Stable: Yes
 */

public class MergeSort {
	
	public int sizeL;
	public int sizeR;
	public int[] tempL;
	public int[] tempR;

	
	public int[] mergeSort(int array[]) {
		if(array.length % 2 == 0) {
			sizeL = array.length/2;
			sizeR = array.length/2;
		}else {
			sizeL = (array.length/2)-1;
			sizeR = array.length/2;
		}
		//division for 2 arrays
		for (int i = 0; i < sizeL-1; i++) {
			tempL[i]=array[i];
			
		}
		for (int j = sizeL ; j < array.length-1; j++) { 
			tempR[j-sizeL]=array[j-sizeL];

		}
		
	}
	
}
