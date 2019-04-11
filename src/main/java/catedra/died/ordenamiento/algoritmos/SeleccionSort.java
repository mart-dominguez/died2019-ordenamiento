package catedra.died.ordenamiento.algoritmos;

public class SeleccionSort implements Ordenador {

	@Override
	public int[] ordenar(int[] arreglo) {
		int n = arreglo.length; 
		int[] ordenado = new int[n]; 
		// copio los datos al arreglo destino
		System.arraycopy(arreglo, 0, ordenado, 0, n);
		
		
		for(int i=0; i<n; i++) {
			int indiceMenor = i;
			for(int j = i + 1;j < n; j++) {
				if(ordenado[j] < ordenado[indiceMenor]) {
					indiceMenor =j;
				}
			}
			 int temp = ordenado[indiceMenor]; 
			 ordenado[indiceMenor] = ordenado[i]; 
			 ordenado[i] = temp; 
		}
		System.out.println("selection "+ordenado.length);
		return ordenado;
	}

}
