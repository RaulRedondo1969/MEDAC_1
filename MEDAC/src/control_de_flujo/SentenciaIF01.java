package control_de_flujo;

import java.util.Scanner;
import java.util.logging.Logger;

public class SentenciaIF01 {

	public static void main(String[] args) {
		
		var logger = Logger.getLogger("MyLog");
		logger.info("Cual es la capital de España?");
		Scanner sc = new Scanner(System.in);
		String capital = sc.nextLine();
		
		if (capital.equalsIgnoreCase("Madrid")) {

			logger.info("La respuesta es correcta");

		} 
		else if (!capital.equalsIgnoreCase("Madrid")){
			logger.info("La respuesta no es correcta");
		}

	}

}
