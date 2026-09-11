package aled2627.clase0911;

public class Padre extends Abuelo {

	public Padre(String nombre) {
		super(nombre);
		this.setNombre(nombre);
	}
	
	@Override
	protected void deTodos() {
		System.out.println("De todos - Padre: " + this.getNombre());
		super.deTodos();
	}
}
