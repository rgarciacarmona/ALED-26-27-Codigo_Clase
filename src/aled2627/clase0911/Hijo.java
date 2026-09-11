package aled2627.clase0911;

public class Hijo extends Padre {

	public Hijo(String nombre) {
		super(nombre);
	}
	
	@Override
	protected void deTodos() {
		System.out.println("De todos - Hijo: " + this.getNombre());
		super.deTodos();
	}
	
	public void delHijo() {
		System.out.println("Del hijo: " + this.getNombre());
	}
}
