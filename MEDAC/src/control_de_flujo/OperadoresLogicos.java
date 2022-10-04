package control_de_flujo;

import java.util.Scanner;
import java.util.logging.Logger;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		var logger = Logger.getLogger("MyLog");
		
		System.out.println("Adivina el numero que estoy pensando");
		System.out.println("Introduce un numero entre el 1 y el 100");
		var sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if((numero < 1)|| (numero >100)) {
			logger.info("El numero debe estar entre 0 y 100");
			logger.info("Tienes otra oportunidad");
			numero =sc.nextInt();
		}
		if(numero ==24) {
			logger.info("Acertaste!!");
		}else {
			logger.info("Termino el juego");
		}

	}

}
