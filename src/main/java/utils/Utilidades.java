package main.java.utils;

import java.util.ArrayList;
import java.util.List;

public class Utilidades {
	
	
	/**
	 * Metodo generico que recibe un array de cualquier clase y devuelve un array
	 * del mismo tamaño, pero en orden inverso. Si el objeto que recibe es nulo
	 * se decuelve el mismoobjeto. Si esta vacio, se devuelve un array del miso tipo vacio
	 * @param <T> Tipo generico que puede utilizarse con cualquier objeto
	 * @param arrayOriginal array a invertir
	 * @return array invertido
	 */
	public static <T> T[]reverse (T[] arrayOriginal){
		T[] clone = null;

		if(arrayOriginal != null) {
			clone = arrayOriginal.clone();
			
			for(int i = 0; i < clone.length; i++) {
				clone[i] = arrayOriginal[clone.length-1 -i];
			}
		}
		
		
		return clone;
	}
	
	public boolean esCapicua (String cadena) {
		boolean resultado = true;
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != cadena.charAt(cadena.length()-1 -i)) {
				resultado = false;
			}
			
		}
		
		return resultado;
	}
	
	public boolean esCapicua (Integer numero) {
		String num = String.valueOf(numero);
		boolean resultado = true;
		
		for(int i = 0; i < num.length(); i++) {
			if(num.charAt(i) != num.charAt(num.length()-1 -i)) {
				resultado = false;
			}
			
		}
		
		return resultado;
	}
	
	public boolean esCapicua (Double numero) {
		String dou = String.valueOf(numero);
		boolean resultado = true;
		
		for(int i = 0; i < dou.length(); i++) {
			if(dou.charAt(i) != dou.charAt(dou.length()-1 -i)) {
				resultado = false;
			}
			
		}
		
		return resultado;	}
	

}
