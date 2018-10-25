
public class ConexionSingleton {
	public static ConexionSingleton instancia;
	
	private ConexionSingleton() {
		
	}
	// para evitar instancia a traves del new
	public static ConexionSingleton getInstancia() {
		if(instancia == null) { //si no se ha creado ningun objeto
			instancia = new ConexionSingleton(); // crea uno
		}
		return instancia;
	}
	
	public void conectar() {
		System.out.println("me conecte a la BD");
	}
	
	public void desconectar() {
		System.out.println("me desconecte a la BD");
	}
}
