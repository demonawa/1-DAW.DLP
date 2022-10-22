package ejer11_21;

import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroUsuario;
		int minutos;
		int segundos;
		Scanner obLectura = new Scanner(System.in);	
		System.out.print("Introduce un número(es equivalente a segundos):");
		numeroUsuario = obLectura.nextInt();
		
		minutos = numeroUsuario / 60;
		segundos = numeroUsuario % 60;
		
		System.out.print("Eso es equivalente a " + minutos + "minutos" + segundos +"segundos");
		
		obLectura.close();
	}

}
