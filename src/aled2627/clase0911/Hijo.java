package aled2627.clase0911;

public class Hijo extends Padre implements Cansable {

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

	@Override
	public String toString() {
		return "Hijo [" + getNombre() + "]";
	}

	@Override
	public void cansar() {
		System.out.println("Soy un Alpha, no puedo cansarme");
	}

	@Override
	public void descansar() {
		System.out.println("Soy un Alpha, ya estaba descansando antes de que me lo dijeras");
	}	
}
