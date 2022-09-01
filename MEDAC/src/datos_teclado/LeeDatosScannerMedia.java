package datos_teclado;

import java.util.Scanner;

public class LeeDatosScannerMedia {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce 3 numeros decimales");
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();
		double media = (x1+x2+x2/3);
		System.out.println("La media es--"+media);
		s.close();
		

	}

}
