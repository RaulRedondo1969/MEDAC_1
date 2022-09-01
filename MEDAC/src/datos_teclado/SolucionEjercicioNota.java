package datos_teclado;

import java.util.Scanner;

public class SolucionEjercicioNota {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la nota...");
		double nota1 = s.nextDouble();
		System.out.println("� Qu� nota quieres sacar en el segundo examen?");
		double nota2 = s.nextDouble();
		@SuppressWarnings("unused")
		double notaFinal=(nota1*40)+(nota2*60)/100;
		System.out.println("Valor de la nota final---"+notaFinal);
		double notaNecesaria =((notaFinal*100)-(nota1*40))/60;
		System.out.print("Valor de nota 2---"+notaNecesaria);
		s.close();
	}

}
