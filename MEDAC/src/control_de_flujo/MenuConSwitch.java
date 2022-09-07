package control_de_flujo;

import java.util.Scanner;
import java.util.logging.Logger;

public class MenuConSwitch {

	public static void main(String[] args) {
	double lado;
	double base;
	double altura;
		
	var logger = Logger.getLogger("MyLog");
	var teclado = new Scanner(System.in);
	System.out.print("\n Calculo de areas");
	System.out.print("\n ----------------");
	System.out.print("\n 1.Cuadrado");
	System.out.print("\n 2.Rectangulo");
	System.out.print("\n 3.Triangulo");
	System.out.print("\n Elija una opcion (1-3)");
	var opcion = teclado.nextInt();
	
	switch(opcion) {
	case 1 : 
		System.out.print("\n Introduce el lado del cuadrado en cm");
		lado = teclado.nextDouble();
		System.out.print("\n El area del cuadrado es.."+(lado*lado)+"cm2");
		break;
	case 2 : 
		System.out.print("\n Introduce la base del rectangulo en cm");
		base = teclado.nextDouble();
		System.out.print("\n Introduce la altura del rectangulo en cm");
		altura = teclado.nextDouble();
		System.out.print("\n El area del rectangulp es.."+(base*altura)+"cm2");
		break;
	case 3 : 
		System.out.print("\n Introduce la base del triangulo en cm");
		base = teclado.nextDouble();
		System.out.print("\n Introduce la altura del triangulo en cm");
		altura = teclado.nextDouble();
		System.out.print("\n El area del rectangulp es.."+((base*altura)/2)+"cm2");
		break;
		
	default:
		logger.info("No existe el numero elegido");
		break;
	}
	teclado.close();
	

	}

}
