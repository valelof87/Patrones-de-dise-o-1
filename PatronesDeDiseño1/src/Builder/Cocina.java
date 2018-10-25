package Builder;

//DIRECTOR. SE VA A ENCARGAR DE GESTIONAR LA CREACION DEL PRODUCTO

public class Cocina {
	protected PizzaBuilder pizzaBuilder;

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void setPizzaBuilder(PizzaBuilder pb) { //PERMITE OBTENER EL PRODUCTO UNA VEZ REALIZADO
		this.pizzaBuilder = pb;
	}
	
	public void construirPizza() {
		pizzaBuilder.crearNuevaPizza();
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildSalsa();
		pizzaBuilder.buildRelleno();
	}
}
