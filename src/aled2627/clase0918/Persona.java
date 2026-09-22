package aled2627.clase0918;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private String nombre;
	private List<Persona> hijos;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		this.hijos = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void addHijo(Persona hijo) {
		if (!hijos.contains(hijo))
			this.hijos.add(hijo);
	}
	
	public void removeHijo(Persona hijo) {
		if (hijos.contains(hijo))
			this.hijos.remove(hijo);
	}
	
	public List<Persona> getHijos() {
		return this.hijos;
	}
	
	// Devuelve un String con el nombre de la
	// Persona y de todos sus hijos y los hijos
	// de sus hijos y los hijos de los hijos de sus
	// hijos y... ya lo pillas
	public String descendientes() {
		// Código común
		String nombres = this.nombre;
		// Caso base
		if (hijos.isEmpty()) {}
		// Paso recursivo
		else  {
			for (Persona hijo : this.hijos) {
				String descendientes = hijo.descendientes();
				nombres += " [" + descendientes + " ]";
			}
		}
		// Código común
		return nombres;
	}
	
	public static void main(String[] args) {
		Persona rodrigo = new Persona("Rodrigo");
		Persona nora = new Persona("Nora");
		Persona david = new Persona("David");
		rodrigo.addHijo(nora);
		rodrigo.addHijo(david);
		Persona xvi36 = new Persona("XVI-36");
		Persona rudersindo = new Persona("Rudersindo");
		nora.addHijo(xvi36);
		nora.addHijo(rudersindo);
		System.out.println(rodrigo.descendientes());
	}
}
