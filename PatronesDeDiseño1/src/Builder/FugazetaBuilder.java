package Builder;

//CONCRETED BUILDER

public class FugazetaBuilder extends PizzaBuilder {
	@Override
	public void buildMasa() {
		pizza.setMasa("media");
		
	}

	@Override
	public void buildSalsa() {
		pizza.setSalsa("poco");
		
	}

	@Override
	public void buildRelleno() {
		pizza.setRelleno("cebolla");
		
	}

}
