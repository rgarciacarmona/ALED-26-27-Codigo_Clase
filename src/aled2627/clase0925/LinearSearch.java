package aled2627.clase0925;

public class LinearSearch {

	// Devuelve -1 si no está
	// O(n)
	private static int linearSearch(int[] list, int item) {
		int pos = -1;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == item)
				pos = i;
		}
		return pos;
		
	}
	
	public static void main(String[] args) {
//		int[] list = { 15, 31, 5, 23, 1, 11, 27, 7, 19, 3, 25, 13, 9, 21, 29, 17 };
//		int toSearch = 21;
//		int pos = linearSearch(list, toSearch);
//		System.out.println("Está en la posición: " + pos);
		int[] arrayMogollonaco = new int[1000000000];
		for (int i = 0; i < arrayMogollonaco.length; i++) {
			arrayMogollonaco[i] = i*2;
		}
		int toSearchMogollonaco = 367453333*2;
		long t1 = System.nanoTime();
		int posMogollonaco = linearSearch(arrayMogollonaco, toSearchMogollonaco);
		long t2 = System.nanoTime();
		System.out.println("Tiempo usado: " + (t2-t1));
		System.out.println("Está en la posición: " + posMogollonaco);
	}

}
