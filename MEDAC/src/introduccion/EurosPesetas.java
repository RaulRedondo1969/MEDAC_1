package introduccion;

public class EurosPesetas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double importeSinIva = 100.00; 
		double iva = 0.21;
		double importeIva = importeSinIva * iva;
		double totalFactura = importeSinIva + importeIva;
		System.out.println("El importe del iva es.."+importeIva);
		System.out.println("El total de la factura es.."+totalFactura);
	}

}
