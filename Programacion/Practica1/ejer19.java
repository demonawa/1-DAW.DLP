package ejer11_21;

import java.util.Scanner;

public class ejer19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		int minutos;
		int segundos;
		int horas;
		Scanner obLectura = new Scanner(System.in);	
		System.out.print("Introduce un número(es equivalente a segundos):");
		segundos = obLectura.nextInt();
		
	horas = segundos / 3600;
	segundos = segundos % 3600;
	minutos = segundos / 60;
	segundos %=60;
	
		System.out.print("Son"+ horas + "horas" + minutos + "minutos" + segundos + "segundos");
		
		obLectura.close();
		
		
		
	}

}
