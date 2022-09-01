package datos_teclado;

import java.util.Scanner;

public class LeeDatosScanner01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Introduce tu nombre");
		String nombre = s.nextLine();
		System.out.println("Introduce tu edad");
		int edad = Integer.parseInt(s.nextLine());// hacemos un cast 
		System.out.println("Tu nombre es.."+nombre+"..Tu edad es..."+edad);
		System.out.println("probando el respositorio");
		s.close();
	}

}
