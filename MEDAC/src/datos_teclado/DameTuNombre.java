package datos_teclado;

import java.io.Console;


public class DameTuNombre {

	public static void main(String[] args) {
		// Este ejemplo hay que ejecutarlo en el terminal de Eclipse
		//Por otro lador tenemos la clase Scanner
	    Console consola = System.console();
	    System.out.println("Por favor, dime c�mo te llamas: ");
		String nombre = consola.readLine();

		System.out.println("Hola " + nombre + ", Estoy encantado de conocerteeee!");
		System.out.println("Hola " + nombre + ", Estoy encantado de  NO conocerteeee!");

	}

}
