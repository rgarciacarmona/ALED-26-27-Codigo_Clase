package aled2627.clase0918;

public class Suma {

	public static int suma(int n) {
		// Caso base
		if (n == 1) {
			return 1;
		}
		// Paso recursivo
		else {
			return n + suma(n - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(suma(5));
	}
}
