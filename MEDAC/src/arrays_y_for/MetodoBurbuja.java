package arrays_y_for;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MetodoBurbuja {
	

	public static void imprimirArray(int[] array) {
		var logger = Logger.getLogger("MyLog");
		logger.info("{");
		
		
		for (var i = 0; i < array.length;i++) {
			logger.log(Level.INFO,"Dato del array:{0}",array[i]);
			if(i < array.length -1) {
				logger.info(",");
			}
			logger.info("}");
			logger.log(Level.INFO,"Tamaño del array:{0}",array.length);
		}
		
	}
	public static void ordenacionBurbuja(int[] array) {
		
		int i, j, auxiliar; 
		
		for (i = 0; i < array.length;i++) {
			
			for(j=0; j < array.length -1; j++) {
				
				if (array[j]>array[j+1]) {
					
					auxiliar = array[j+1];
					array[j+1]=array[j];
					array[j] = auxiliar;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {

		int array[]= {7,10,1,9,0,41,12,-6,32,-1};
		imprimirArray(array);

	}

}
