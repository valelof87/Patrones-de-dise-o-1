package Builder;

public class Principal {

	public static void main(String[] args) {
		Cocina cocina = new Cocina(); //INSTANCIAMOS EL DIRECTOR
		
		PizzaBuilder napolitana = new NapolitanaBuilder();
		PizzaBuilder fugazeta = new FugazetaBuilder();
		
		cocina.setPizzaBuilder(napolitana);
		cocina.construirPizza();
		
		Pizza pizza = cocina.getPizza();

	}

}
