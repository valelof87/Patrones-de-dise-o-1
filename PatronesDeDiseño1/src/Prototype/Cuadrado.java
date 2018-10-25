package Prototype;

public class Cuadrado implements Figura {

	private String nombre;
	private int posicionx, posiciony;
	
	
	public Cuadrado() {
	}

	@Override
	public void setNombre(String n) {
		this.nombre = n;
		
	}

	@Override
	public String getNombre() {
	
		return nombre;
	}

	@Override
	public void mover(int x, int y) {
		this.posicionx = x;
		this.posiciony = y;
		
	}

	@Override
	public void getPosicion() {
		System.out.println("Cuadrado en x = " + this.posicionx);
		System.out.println("Cuadrado en y = " + this.posiciony);
	}

	@Override
	public Figura clonar() {
		Figura figura = new Cuadrado();
		figura.setNombre(this.nombre);
		figura.mover(this.posicionx, this.posiciony);
		return figura;
	}

}
