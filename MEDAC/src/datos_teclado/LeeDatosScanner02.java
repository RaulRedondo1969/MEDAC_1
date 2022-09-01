package datos_teclado;

import java.util.Scanner;

public class LeeDatosScanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		System.out.println("Introduce tu nombre y edad separados por un espacio:");
		String nombre = s.next();// este metodo lee cadenas de caracteres 
		int edad = s.nextInt();// este metodo lee enteros 
		System.out.println("Tu nombre es--"+nombre+"--tu edad es--"+edad);
		s.close();

	}

}
