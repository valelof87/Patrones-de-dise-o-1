package Builder;

//CONCRETED BUILDER
//ASIGNA VALORES PREDETERMINADOS

public class NapolitanaBuilder extends PizzaBuilder {

	@Override
	public void buildMasa() {
		pizza.setMasa("alta");
		
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("suave");
		
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("Tomate, ajo");
		
	}
	
	

}
