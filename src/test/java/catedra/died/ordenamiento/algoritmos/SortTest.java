package catedra.died.ordenamiento.algoritmos;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortTest {
	
	private static int[] crearArreglo(int n) {
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=i;
		}
		
		Random rnd = new Random();
		
		for (int i = arr.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			int a = arr[index];
			arr[index] = arr[i];
			arr[i] = a;
		}
		return arr;
	}

	private Ordenador ordenador;
	static int[] arregloOrdenar;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(" crea arreglo ordenar");
		arregloOrdenar = SortTest.crearArreglo(1000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Test
	public void ordenarBurbuja() {
		ordenador = new Burbuja();
		int[] resultado = ordenador.ordenar(arregloOrdenar);
		System.out.println(" BURBUJA SORT ");
		print(arregloOrdenar);
		for(int i=1;i<resultado.length;i++) {
			assertTrue(resultado[i-1]<resultado[i]);
		}
		System.out.println(" BURBUJA SORT finalizo");
		print(resultado);
	}
	
	@Test
	public void ordenarSeleccion() {
		ordenador = new SeleccionSort();
		int[] resultado = ordenador.ordenar(arregloOrdenar);
		System.out.println(" SELECCION SORT ");
		print(arregloOrdenar);
		for(int i=1;i<resultado.length;i++) {
			assertTrue(resultado[i-1]<resultado[i]);
		}
		print(resultado);
	}
	
	private void print(int[] arr) {
		System.out.println(" Imprimir ..."+ arr.length);
		for(int i=0; i< arr.length; i++) {
			System.out.print(+arr[i]+",");	
			if(i%50==0) {
				System.out.println("");
				System.out.println(" _");
			}
		}
		System.out.println(" ____ - "+ arr.length);
	}


}
