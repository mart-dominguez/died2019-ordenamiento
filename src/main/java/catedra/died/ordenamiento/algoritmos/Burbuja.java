package catedra.died.ordenamiento.algoritmos;

import java.util.Arrays;

public class Burbuja  implements Ordenador{

	@Override
	public int[] ordenar(int[] arreglo) {
        int n = arreglo.length; 
		int[] resultado = new int[n]; 
		// copio los datos al arreglo destino
		System.arraycopy(arreglo, 0, resultado, 0, n);
		
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (resultado[j] > resultado[j+1]) { 
                    int temp = resultado[j]; 
                    resultado[j] = resultado[j+1]; 
                    resultado[j+1] = temp; 
                }             	
            }        	
        }
        return resultado;
    } 

	
}
