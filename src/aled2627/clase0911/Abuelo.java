package aled2627.clase0911;

public class Abuelo  implements Cansable {
	// Atributos
	private String nombre;

	// Métodos

	// Constructor (se llama cuando haces new)
	// No devuelve nada y se llama como la clase
	public Abuelo(String nombre) {
		this.nombre = nombre;
	}

	private void soloDelAbuelo() {
		System.out.println("Solo del abuelo: " + this.nombre);
	}

	protected void deTodos() {
		System.out.println("De todos - Abuelo: " + this.nombre);
	}

	public void delAbuelo() {
		System.out.println("Del abuelo: " + this.nombre);
		this.soloDelAbuelo();
	}
	
	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Abuelo [" + getNombre() + "]";
	}

	@Override
	public void cansar() {
		System.out.println("No puedes cansarme, viví la posguerra");
	}

	@Override
	public void descansar() {
		System.out.println("No puedo descansar, la vida es trabajar");
	}
}
