package Builder;

//ABSTRACT BUILDER

public abstract class PizzaBuilder {
	protected Pizza pizza; // TIENE QUE TENER COMO ATRIBUTO UN OBJETO DEL TIPO DE LA CLASE PRODUCTO	
	
	public Pizza getPizza() { //DEBE RETORNAR EL OBJETO
		return pizza;
	}
	
	public void crearNuevaPizza() { //METODO PARA INSTANCIARLO
		pizza = new Pizza();
	}
	
	
	//METODOS ABSTRACTOS QUE SE ENCARGAN DE ASIGNAR VALORES PERO NO LOS DEFINE
	//LOS CONCRETED BUILDERS SE ENCARGAN DE IMPLEMENTARLOS
	public abstract void buildMasa();
	public abstract void buildSalsa();
	public abstract void buildRelleno();
}
