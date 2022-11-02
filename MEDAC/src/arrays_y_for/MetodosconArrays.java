package arrays_y_for;

public class MetodosconArrays {
	
	public static void rellenarArray(int[]array) {
		
		for (var i = 0; i < array.length;i++) {
			array[i] = 7;
		}
		
		
	}

	public static void main(String[] args) {
		int arrayPrueba[]=new int[10];
		
		rellenarArray(arrayPrueba);
		
		for (var i = 0;i < arrayPrueba.length;i++) {
			
			System.out.println(arrayPrueba[i]);
		}

	}

}
