package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

//6.- Dise�a un programa que solicite al usuario su edad, y a continuaci�n indique si es mayor o menor de
//edad, os pod�is ayudar del operador condicional, no se puede utilizar la sentencia condicional if.
public class ejer6 {
	/**
	 * Ejemplo completo de lectura de datos de teclado y escritura
	 * 
	 * @author Daniel L�pez P�ez
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
