package arrays_y_for;

public class BusquedaLineal {

	public static boolean busquedaLineal(int array[], int elemento) {
		var encontrado = false;
		for (var i = 0; i < array.length && !encontrado; i++) {
			System.out.println(i);
			System.out.println(encontrado);
			if (array[i] == elemento) {
				encontrado = true;
			}

		}

		return encontrado;

	}

	public static void main(String[] args) {
		int[] array = new int[10];
		// rellenamos el array
		for (var i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		boolean elCuatro = busquedaLineal(array, 4);
		System.out.println("Resultado.." + elCuatro);
	}

}
