package aled2627.clase0910;

public class ValorReferencia {

	// "x" e "y" para toda la clase
	// (salvo que un método redefina otra "x" e "y")
	static int x = 1;
	static int y = 1;
	
	// Tipo primitivo: paso por valor (copia)
	public static void aumenta(int x) {
		// "x" solo para este método
		x = x + 2;
	}
	
	// Array: paso por referencia
	public static void aumentaArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}
	}
	
	// Tipo primitivo: paso por referencia
	public static int aumentaBien(int x) {
		// "x" solo para este método
		x = x + 2;
		return x; // Devuelve la "x" del método
	}
	
	public static void main(String[] args) {
		// "x" solo para este método
		int x = 0;
		System.out.println(x);
		aumenta(x);
		System.out.println(x);
		x = aumentaBien(x);
		System.out.println(x);
		int[] arr = new int[4];
		arr[0] = 2; arr[1] = 4; arr[2] = 8; arr[3] = 16;
		aumentaArr(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array pos " + i + " valor: " + arr[i]);
		}
		{
			// Deja de existir cuando 
			// se cierran las llaves
			int y = 0;
			System.out.println(y);
		}
		System.out.println(y);
	}
}
