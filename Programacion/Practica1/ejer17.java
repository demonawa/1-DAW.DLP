package ejer11_21;

import java.util.Scanner;

public class ejer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variableA;
		int variableB;
		int variableC;
		int variableD;
		
		Scanner obLectura = new Scanner(System.in);	
		System.out.print("Introduce un n�mero:");
		variableA = obLectura.nextInt();
		
		System.out.print("Introduce un n�mero:");
		variableB = obLectura.nextInt();
		
		System.out.print("Introduce un n�mero:");
		variableC = obLectura.nextInt();
		
		System.out.print("Introduce un n�mero:");
		variableD = obLectura.nextInt();
		
		System.out.print(((Math.pow(variableA, variableB)) + (Math.pow(variableC, variableD))) * ((Math.pow(variableA, variableC)) + (Math.pow(variableB, variableD))));
		
		obLectura.close();

	}

}
