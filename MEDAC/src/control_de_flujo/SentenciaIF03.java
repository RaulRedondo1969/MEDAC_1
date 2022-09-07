package control_de_flujo;

import java.util.Scanner;
import java.util.logging.Logger;

public class SentenciaIF03 {

	public static void main(String[] args) {

		var logger = Logger.getLogger("MyLog");
		logger.info("Qué nota has sacado en el último examen..?");
		Scanner sc = new Scanner(System.in);
		double nota = sc.nextDouble();
		if(nota >=5) {
			logger.info("Has aprobado");
		}else {
			logger.info("Has suspendido");
		}
		sc.close();
	}

}
