package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo completo de lectura de datos de teclado y escritura
 * 
 * @author Daniel López Páez
 * @version: 1.0
 */

public class ejer03 {
//3.- Realizar un programa que calcule la media aritmética de tres valores que se han leído de teclado, y
	//muestre el resultado por pantalla.
	
	public static void main(String[] args) {
		
		float valor1, valor2, valor3;
		float media;
		
		Scanner obLectura = new Scanner(System.in);
		obLectura.useLocale(Locale.ENGLISH);
		System.out.print("Introduzca un valor:");
		valor1 = obLectura.nextFloat();
		System.out.print("Introduzca un valor:");
		valor2 = obLectura.nextFloat();
		System.out.print("Introduzca un valor:");
		valor3 = obLectura.nextFloat();
		
		
		media = (valor1+valor2+valor3)/3;
		System.out.println("Su resultado es:"+ media);
		obLectura.close();
	}

}
