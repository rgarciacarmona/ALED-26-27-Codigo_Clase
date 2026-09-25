package aled2627.clase0925;

public class BinarySearch {

	public static int binarySearch(int[] array, int value) {
		return binarySearch(array, value, 0, array.length);
	}
	
	// O(log n)
	private static int binarySearch(int[] array, int value, int lo, int hi) {
		while (lo < hi) {
			// Calculamos el punto medio
			int m = (int) Math.floor((lo + hi)/2);
			int v = array[m];
			// ¿Lo hemos encontrado?
			if (v == value) {
				return m;
			}
			// No :( A dividir por la mitad
			else if (v < value) { // ->
				lo = m + 1;
			} else { // <-
				hi = m;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
//		int[] array = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31 };
//		int toSearch = 21;
//		int pos = binarySearch(array, toSearch);
//		System.out.println("Está en la posición: " + pos);
		int[] arrayMogollonaco = new int[1000000000];
		for (int i = 0; i < arrayMogollonaco.length; i++) {
			arrayMogollonaco[i] = i*2;
		}
		int toSearchMogollonaco = 367453333*2;
		long t1 = System.nanoTime();
		int posMogollonaco = binarySearch(arrayMogollonaco, toSearchMogollonaco);
		long t2 = System.nanoTime();
		System.out.println("Tiempo usado: " + (t2-t1));
		System.out.println("Está en la posición: " + posMogollonaco);
	}

	
	
	
	
	
	
}
