package Prototype;

public class Circulo implements Figura {
	private String nombre;
	private int posicionx, posiciony;
	
	
	public Circulo() {
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
		System.out.println("Circulo en x = " + this.posicionx);
		System.out.println("Circulo en y = " + this.posiciony);
	}

	@Override
	public Figura clonar() {
		Figura figura = new Circulo();
		figura.setNombre(this.nombre);
		figura.mover(this.posicionx, this.posiciony);
		return figura;
	}

}
