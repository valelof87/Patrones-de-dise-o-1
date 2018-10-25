
public class App {

	public static void main(String[] args) {
		ConexionSingleton c = ConexionSingleton.getInstancia();
		c.conectar();
		c.desconectar();

	}

}
