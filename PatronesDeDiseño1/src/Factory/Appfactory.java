package Factory;

public class Appfactory {

	public static void main(String[] args) {
		Factura f= FactoriaFacturas.getFactura("Iva");
		f.setId(1);
		f.setImporte(100);
		
		System.out.println(f.getImporteIva());
	}
	
}
