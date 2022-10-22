package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejemplo completo de lectura de datos de teclado y escritura
 * 
 * @author Daniel L�pez P�ez
 * @version: 1.0
 */

//2.- Escribir un programa que pida el a�o actual y el de nacimiento del usuario. Debe calcular su edad,
//suponiendo que en el a�o en curso el usuario ya ha cumplido a�os.

public class ejer02 {

	public static void main(String[] args) {
		
		int a�oActual;
		int nacimientoUsuario;
		
		Scanner obLectura = new Scanner(System.in);
		obLectura.useLocale(Locale.ENGLISH);
		
		System.out.print("Escriba el a�o actual:");
		
		a�oActual = obLectura.nextInt();
		System.out.print("Escriba el a�o en que naci�:");
		nacimientoUsuario = obLectura.nextInt();
		
		int edadUsuario = a�oActual - nacimientoUsuario;
		
		System.out.println("Tu edad actual es:" + edadUsuario);
		
		
		obLectura.close();
	}

}
