package control_de_flujo;

import java.util.Scanner;
import java.util.logging.Logger;

public class SentenciaIF02 {

	public static void main(String[] args) {
		
		var logger = Logger.getLogger("MyLog");
		var sc = new Scanner(System.in);
		logger.info("Introduce un numero");
		var numero = sc.nextInt();
		if(numero > 0) {
			logger.info("El numero es positivo");
		}
		else {
			logger.info("El numero no es positivo");
		}
		sc.close();

	}

}
