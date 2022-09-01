package datos_teclado;

public class LeeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String linea; 
		System.out.println("Por favor, introduce un numero"); 
		linea = System.console().readLine();
		int primerNumero; 
		primerNumero = Integer.parseInt(linea);//aquí hacemos el cast
		System.out.println("Por favor, introduce otro numero");
		linea = System.console().readLine();
		int segundoNumero = Integer.parseInt(linea);
		int total; 
		total = (2*primerNumero)+segundoNumero;
		System.out.println("El primer numero introducido es.."+primerNumero);
		System.out.println("El segundo numero introducido es.."+segundoNumero);
		System.out.println("El total es.."+total);
	}

}
