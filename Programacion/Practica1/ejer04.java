package ejer1_10;
//4.- Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello el usuario debe
//introducir el radio (que puede contender decimales).
//longitud = 2 . π . radio 
//area = π . radio2

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo completo de lectura de datos de teclado y escritura
 * 
 * @author Daniel López Páez
 * @version: 1.0
 */

public class ejer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float radio;
		double longitud;
		double area;
		
		Scanner obLectura = new Scanner(System.in);
		obLectura.useLocale(Locale.ENGLISH);
		
		System.out.print("Introduce el valor del radio:");
		radio = obLectura.nextFloat();
		
		longitud = (2*Math.PI*radio);
		System.out.println("El valor de la longitud:" + longitud);
		
		area = (Math.PI*Math.pow(radio,2));
		System.out.println("El valor del area:" + area);
		
		
		
		obLectura.close();
		
	}

}
