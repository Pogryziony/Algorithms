package com.github.Pogryziony.Sorting;

public class BubbleSort {

	public Integer[] bubbleSort(Integer[] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}
