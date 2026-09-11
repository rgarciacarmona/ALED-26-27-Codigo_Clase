package aled2627.clase0911;

public class Padre extends Abuelo implements Cansable {

	private boolean cansado;
	
	public Padre(String nombre) {
		super(nombre);
		this.cansado = false;
	}
	
	@Override
	protected void deTodos() {
		System.out.println("De todos - Padre: " + this.getNombre());
		super.deTodos();
	}
	
	@Override
	public String toString() {
		return "Padre [" + getNombre() + "]";
	}
	
	public void cansar() {
		if (!cansado) {
			this.cansado = true;
			System.out.println("Me canso");
		}
		else {
			System.out.println("Ya estaba cansado");
		}
	}
	
	public void descansar() {
		if (cansado) {
			this.cansado = false;
			System.out.println("Descanso");
		}
		else {
			System.out.println("Ya estaba descansado");
		}
	}
}
