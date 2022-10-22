package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

//6.- Diseña un programa que solicite al usuario su edad, y a continuación indique si es mayor o menor de
//edad, os podéis ayudar del operador condicional, no se puede utilizar la sentencia condicional if.
public class ejer6 {
	/**
	 * Ejemplo completo de lectura de datos de teclado y escritura
	 * 
	 * @author Daniel López Páez
	 * @version: 1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte edadUsuario;
		
		
		Scanner obLectura = new Scanner(System.in);
		obLectura.useLocale(Locale.ENGLISH);

		System.out.print("Indica tu edad:");
		edadUsuario = obLectura.nextByte();
		
		System.out.println((edadUsuario >= 18)? "Eres mayor de edad":"Eres menor de edad");
		

		
		obLectura.close();

	}

}
