package Factory;

public class FactoriaFacturas {

	public static Factura getFactura(String tipo) {
		if(tipo.equals("Iva")) {
			return new FacturaIva();
		}
		return new FacturaIvaReducido();
		
	}
}

/*Como vemos la clase Factura es una clase abstracta de la cual heredan nuestras dos clases
concretas que implementan el c�lculo del IVA.  
Vamos a construir una Factor�a para que se encargue de construir ambos objetos de la jerarqu�a.*/