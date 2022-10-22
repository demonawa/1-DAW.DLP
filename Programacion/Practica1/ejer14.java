package ejer11_21;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float numeroUsuario1;
		float numeroUsuario2;
		float multiplicacion;
		float division;
		float resta;
		float suma;
		Scanner obLectura = new Scanner(System.in);	
		System.out.print("Introduce un número):");
		numeroUsuario1 = obLectura.nextFloat();
		
		System.out.print("Introduce un número):");
		numeroUsuario2 = obLectura.nextFloat();
		
		multiplicacion = numeroUsuario1 * numeroUsuario2;
		System.out.println("El resultao de la multiplicacion es " + multiplicacion);
		division = numeroUsuario1 / numeroUsuario2;
		System.out.println("El resultao de la division es " + division);
		resta = numeroUsuario1 - numeroUsuario2;
		System.out.println("El resultao de la resta es " + resta);
		suma = numeroUsuario1 + numeroUsuario2;
		System.out.println("El resultao de la suma es " + suma);
		
		System.out.println("Fin del programa");
		obLectura.close();

	}

}
