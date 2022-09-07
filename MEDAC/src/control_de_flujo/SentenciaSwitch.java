package control_de_flujo;

import java.util.Scanner;
import java.util.logging.Logger;

public class SentenciaSwitch {

	public static void main(String[] args) {
		
		var logger = Logger.getLogger("MyLog");
		var teclado = new Scanner(System.in);
		logger.info("Introduce un mes por teclado");
		int mes = teclado.nextInt();
		String nombreMes;
		switch (mes) {
		case 1:
			nombreMes="Enero";
		break;
		case 2:
			nombreMes="Febrero";
		break;
		case 3:
			nombreMes="Marzo";
		break;
		case 4:
			nombreMes="Abril";
		break;
		case 5:
			nombreMes="Mayo";
		break;
		case 6:
			nombreMes="Junio";
		break;
		case 7:
			nombreMes="Julio";
		break;
		case 8:
			nombreMes="Agosto";
		break;
		case 9:
			nombreMes="Septiembre";
		break;
		case 10:
			nombreMes="Octubre";
		break;
		case 11:
			nombreMes="Noviembre";
		break;
		case 12:
			nombreMes="Diciembre";
		break;

		default:
			nombreMes="No existe ese mes";
			break;
		}
	logger.info("El nombre del mes es..."+nombreMes);
	teclado.close();
	}

}
