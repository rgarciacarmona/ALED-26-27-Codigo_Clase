package aled2627.clase0924;

import java.util.ArrayList;
import java.util.List;

public class Complejidad {

	// Array de entrada de longitud n
	// O(n)
	public static int sumArray(int[] intArray) {
		int suma = 0; // O(1)
		for(int i = 0; i < intArray.length; i++) { // O(n) el bucle for
			suma += intArray[i]; // O(1) esta línea
		}
		return suma; // O(1)
	}
	
	public static int numDuplicates(int[] intArray) { // O(n²)
		int numDup = 0; // O(1)
		for(int i = 0; i < intArray.length; i++) { // O(2n²)
			// Comparo cada número con todos los demás
			for(int j = 0; j < intArray.length; j++) { // O(2n)
				if (i<j && (intArray[i] == intArray[j])) { // O(1)
					numDup++; // O(1)
				}
			}
		}
		return numDup; // O(1)
	}
	
	public static int numDuplicatesPro(int[] intArray) { // O(n²)
		int numDup = 0; // O(1)
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i < intArray.length; i++) { // O(2n²)
			// Comparo cada número con todos los demás
			if (!lista.contains(intArray[i])) {
				numDup++;
				lista.add(intArray[i]);
			}
		}
		return numDup; // O(1)
	}
	
	public static int numDuplicatesAlberto(int[] intArray) { // O(n² + 2) -> O(n²)
		int numDup = 0; // O(1)
		for(int i = 0; i < intArray.length; i++) { // O(n²/2 + n/2) -> O(n²)
			// Comparo cada número con todos los demás
			for(int j = i+1; j < intArray.length; j++) { 
				if (intArray[i] == intArray[j]) { // O(1)
					numDup++; // O(1)
				}
			}
		}
		return numDup; // O(1)
	}
	
	public static int sumArrayTwice(int[] intArray) { // O(n)
		int suma = 0; // O(1)
		for(int i = 0; i < intArray.length; i++) { // O(n) el bucle for
			suma += intArray[i]; // O(1) esta línea
		}
		for(int i = 0; i < intArray.length; i++) { // O(n) el bucle for
			suma += intArray[i]; // O(1) esta línea
		}
		return suma;
	}

	// Suma todos los números de un array hasta que se encuentra un 7
	// [7, 1, 3, 5, 6, 9]
	// [1, 3, 5, 6, 7, 9]
	// [1, 3, 5, 6, 9, 7]
	public static int sumArrayStop7(int[] intArray) { // O(n)
		int suma = 0;
		for (int t : intArray) {
			if (t == 7) {
				break;
			}
			suma += t;
		}
		return suma;
 	}






}
