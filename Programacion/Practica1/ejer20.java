package ejer11_21;

import java.util.Scanner;

public class ejer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int hormigas;
		int ara�as;
		int cochinillas;
		
		Scanner obLectura = new Scanner(System.in);	
		System.out.print("Introduce el n�mero de hormigas capturadas:");
		hormigas = obLectura.nextInt();
		
		int patasHormigas = hormigas * 6;
		
		System.out.print("Introduce el n�mero de ara�as capturadas:");
		ara�as = obLectura.nextInt();
		
		int patasAra�as = ara�as * 8;
		
		System.out.print("Introduce el n�mero de cochinillas capturadas:");
		cochinillas = obLectura.nextInt();
		
		int patasCochinillas = cochinillas * 14;
		
		System.out.println("Has capturado un total de "+hormigas +" hormigas" + " con un total de "+patasHormigas +"patas totales." );
		System.out.println("Has capturado un total de "+ara�as +"ara�s" + "con un total de "+patasAra�as+"patas totales." );
		System.out.println("Has capturado un total de "+cochinillas+"cochinillas" + "con un total de "+patasCochinillas+"patas totales." );
		
		obLectura.close();
	}
	

}
