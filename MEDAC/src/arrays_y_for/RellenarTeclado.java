package arrays_y_for;

import java.util.Scanner;

public class RellenarTeclado {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int arrayNumeros[] = new int[10]; 
		var suma = 0; 
		int i=0;
		for ( i = 0; i<9; i++) {
			
			System.out.println("Introduce un numero"); 
			var numero = teclado.nextInt();
			arrayNumeros[i]=numero;
			suma += numero;
		
			
			
		}
		System.out.println("La suma de los números es.."+suma);
		for(i=0;i<arrayNumeros.length;i++) {
			System.out.println("Listado de numeros.."+arrayNumeros[i]);
		}
		
		teclado.close();


	}

}
