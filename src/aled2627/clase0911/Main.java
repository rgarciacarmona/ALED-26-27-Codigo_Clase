package aled2627.clase0911;

import java.util.ArrayList;
import java.util.List;

public class Main {

	// Polimorfismo: Acepto cualquier cosa que sea Abuelo
	private static void llamaAlAbuelo(Abuelo a) {
		a.deTodos();
		a.delAbuelo();
		// Si no lo entiendes, move on
		if (a instanceof Hijo) {
			((Hijo) a).delHijo();
		}
	}
	
	public static void main(String[] args) {
		Hijo h = new Hijo("Esteban");
		Padre p = new Padre("Juan");
		Abuelo a = new Abuelo("Rudersindo");
		List<Cansable> lCansables = new ArrayList<Cansable>();
		lCansables.add(h);
		lCansables.add(p);
		lCansables.add(a);
		// for-each
		for (Cansable c : lCansables) {
			c.cansar();
			c.descansar();
		}
//		System.out.println("-------");
//		h.delHijo();
//		h.deTodos();
//		h.delAbuelo();
//		System.out.println("-------");
//		llamaAlAbuelo(h);
//		System.out.println("-------");
//		llamaAlAbuelo(a);
//		System.out.println("-------");
//		List<Abuelo> lista = new ArrayList<Abuelo>();
//		lista.add(h);
//		lista.add(p);
//		lista.add(a);
	}

}
