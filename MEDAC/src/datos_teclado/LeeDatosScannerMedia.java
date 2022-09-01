package datos_teclado;

import java.util.Scanner;

public class LeeDatosScannerMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce 3 numeros decimales");
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();
		double media = (x1+x2+x2/3);
		System.out.println("La media es--"+media);
		

	}

}
