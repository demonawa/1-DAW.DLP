import java.util.Locale;
import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {


		float num1;
		byte eleccion;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce un numero");
		num1=sc.nextFloat();

		System.out.println("1.-El cuadrado de un número"+
				" 2.- El cubo de un número" 
				+ " 3.-La raíz cuadrrada de un número" +
				" 4.- Para cerrar el programa");
		eleccion = sc.nextByte();

		switch (eleccion) {
		case 1:System.out.println(Math.pow(num1,2)); break;
		case 2:System.out.println(Math.pow(num1,3)); break;
		case 3:System.out.println(Math.sqrt(num1)); break;
		case 4:System.out.println("Programa finalizado"); break;
		}

/*
		if (eleccion==1)
			System.out.println(Math.pow(num1,2));
		else if(eleccion==2)
			System.out.println(Math.pow(num1,3));
		else if(eleccion==3)
			System.out.println(Math.sqrt(num1));
		else if(eleccion==4)
			System.out.println("Programa finalizado");*/

		sc.close();


	}


}
