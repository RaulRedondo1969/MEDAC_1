package soluciones;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SolucionTema3Practica12 {

	public static void main(String[] args) {
		
		int n, digitos = 0; 
		var logger = Logger.getLogger("MyLog");
		logger.info("Por avor introduza un número entero de 5 cifras");
		var teclado = new Scanner(System.in);
		var numero = teclado.nextInt();
		if(numero < 10 ) {
			digitos = 1;
		}
		if ((numero > 10)&&(numero < 100)) {
			
			digitos = 2;
		}
		if((numero > 100) && (numero < 1000)) {
			
			digitos = 3; 
		}
		if(numero > 1000 && numero < 10000) {
			
			digitos= 4;
		}
		if( numero > 10000) {
			
			digitos = 5;
		}
		
		logger.log(Level.INFO,"El numero introducido tiene:{0} digitos",digitos);
	}

}
