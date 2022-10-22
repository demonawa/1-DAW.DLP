package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class ejer01 {

	
		/**
		 * Ejemplo completo de lectura de datos de teclado y escritura
		 * 
		 * @author Daniel López Páez
		 * @version: 1.0
		 */

//1.- Hacer un programa que pida al usuario su edad, y muestre la edad que tendrá el próximo año.
		
	public static void main(String[] args) {
		byte EdadUsuario; //La variable byte ocupa menos espacio y se puede usar para esta ocasion
		byte EdadFuturo;
		
		Scanner obLectura = new Scanner(System.in);
		obLectura.useLocale(Locale.ENGLISH);
		System.out.print("Introduzca aquí su edad:");
		
		EdadUsuario = obLectura.nextByte();
		EdadFuturo = (byte) (EdadUsuario + 1);
		
		System.out.print("Tu edad dentro de un año será:" + EdadFuturo);
		
		obLectura.close();
		
	}

}
