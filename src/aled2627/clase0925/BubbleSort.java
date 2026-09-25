package aled2627.clase0925;

public class BubbleSort {

	private static void bubbleSort(int[] array) { // O(n²)
		for (int i = 0; i < array.length; i++) { // 0..N
			for (int j = 0; j < array.length-1-i; j++) { // 0..N-1-i
				if (array[j] > array[j+1]) {
					swap(array,j,j+1);
				}
			}
		}
	}
	
	private static void swap(int[] array, int a, int b) {
		// Uso temp para no perder lo que había en a
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}






