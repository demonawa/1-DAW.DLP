package ejer11_21;


import java.util.Scanner;

public class ejer21 {

	public static void main(String[] args) {


		int entradasInf,entradasAd;
		float totalAd,totalInf,precioInf=15.50f,precioAd=20f,total;
	 

		Scanner obLectura = new Scanner(System.in);	
		
		System.out.print("Introduce el n�mero de entradas infantiles que desa comprar:");
		entradasInf = obLectura.nextInt();
		
		System.out.print("Introduce el n�mero de entradas de adultos que desa comprar:");
		entradasAd = obLectura.nextInt();
		
		totalInf = (float) (entradasInf * precioInf);
		
		totalAd = (float) (entradasAd * precioAd);
		
		total = totalInf +  totalAd;
		
		System.out.println((total >= 100)? ((total) - (total*0.05)):"�");
		obLectura.close();

	}

}
