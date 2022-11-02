package arrays_y_for;

public class ImprimirListas {

	public static void main(String[] args) {
		
		double [] lista = {19,12.89,16.5,200,13.7};
		double total = 0; 
		for (var i = 0; i < lista.length;i++) {
			total = total + lista[i];
			
		}
		System.out.print("El total de la lista es..."+total);

	}

}
