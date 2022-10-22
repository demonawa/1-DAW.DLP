package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo completo de lectura de datos de teclado y escritura
 * 
 * @author Daniel López Páez
 * @version: 1.0
 */

//2.- Escribir un programa que pida el año actual y el de nacimiento del usuario. Debe calcular su edad,
//suponiendo que en el año en curso el usuario ya ha cumplido años.

public class ejer02 {

	public static void main(String[] args) {
		
		int añoActual;
		int nacimientoUsuario;
		
		Scanner obLectura = new Scanner(System.in);
		obLectura.useLocale(Locale.ENGLISH);
		
		System.out.print("Escriba el año actual:");
		
		añoActual = obLectura.nextInt();
		System.out.print("Escriba el año en que nació:");
		nacimientoUsuario = obLectura.nextInt();
		
		int edadUsuario = añoActual - nacimientoUsuario;
		
		System.out.println("Tu edad actual es:" + edadUsuario);
		
		
		obLectura.close();
	}

}
