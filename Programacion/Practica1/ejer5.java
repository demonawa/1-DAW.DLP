package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

//5.- Realizar un programa para calcular el valor de la hipotenusa de un triángulo rectángulo aplicando el
//teorema de Pitágoras. Se pedirán por teclado los dos catetos, y se mostrará por pantalla el resultado
//de calcular la hipotenusa.
public class ejer5 {
	/**
	 * Ejemplo completo de lectura de datos de teclado y escritura
	 * 
	 * @author Daniel López Páez
	 * @version: 1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valorCateto1, valorCateto2;
		double hipotenusa;
		
		Scanner obLectura = new Scanner(System.in);
		obLectura.useLocale(Locale.ENGLISH);
		
		System.out.print("Introduce el valor del cateto1:");
		valorCateto1 = obLectura.nextFloat();
		
		System.out.print("Introduce el valor del cateto2:");
		valorCateto2 = obLectura.nextFloat();
		
		hipotenusa = Math.sqrt(Math.pow(valorCateto1,2)+ Math.pow(valorCateto2,2));
		
		System.out.println("El valor de la hipotenusa es:" + hipotenusa );
		
		obLectura.close();
	}

}
