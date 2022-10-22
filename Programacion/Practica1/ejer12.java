package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo completo de lectura de datos de teclado y escritura
 * 
 * @author Daniel López Páez
 * @version: 1.0
 */
public class ejer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float tarifaHora;
	float horasTrabajadas;
	float cantidadTotal; 	
	final float IRPF = 0.07f;
	final float SS = 0.04f;
	Scanner obLectura = new Scanner(System.in);
	
	System.out.print("Introduce la tarifaXhora:");
	obLectura.useLocale(Locale.ENGLISH);
	tarifaHora = obLectura.nextFloat();
	
	System.out.print("Introduce el número de horas trabajadas:");
	obLectura.useLocale(Locale.ENGLISH);
	horasTrabajadas = obLectura.nextFloat();
	
	
	cantidadTotal =(tarifaHora * horasTrabajadas)-((tarifaHora * horasTrabajadas)*(IRPF+SS));
	
	System.out.print("El salario es de:"+ cantidadTotal);
	
	obLectura.close();
	}

}
