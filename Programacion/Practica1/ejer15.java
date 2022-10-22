package ejer11_21;

import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int base;
		int altura;
		int superficie;
		Scanner obLectura = new Scanner(System.in);	
		System.out.print("Introduce un número):");
		base = obLectura.nextInt();
		
		System.out.print("Introduce un número):");
		altura = obLectura.nextInt();
		
		superficie = (base * altura) /2;
		
		System.out.print("La superficie es igual a :" +superficie);
		obLectura.close();
	}

}
