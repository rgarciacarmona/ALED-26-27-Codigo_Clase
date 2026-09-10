package aled2627.clase0910;

public class ValorReferencia {

	// "x" e "y" para toda la clase
	// (salvo que un método redefina otra "x" e "y")
	static int x = 1;
	static int y = 1;
	
	// Tipo primitivo: paso por valor
	public static void aumenta(int x) {
		// "x" solo para este método
		x = x + 2;
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
		{
			// Deja de existir cuando 
			// se cierran las llaves
			int y = 0;
			System.out.println(y);
		}
		System.out.println(y);
	}
}
