import java.util.Locale;
import java.util.Scanner;

public class ejer32 {

	public static void main(String[] args) {

		int num1,cont=1,maximo=0,minimo=0;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduzca un número");
		num1=sc.nextInt();
		
		maximo=num1;
		minimo=num1;
		
		
		while (num1!=0) {
			cont = cont +1;
			System.out.println("Introduzca un número");
			num1=sc.nextInt();

			if(maximo<num1)
				maximo=num1;

			if((minimo>num1) && (num1!=0))
				minimo=num1;

		}
		System.out.println("El numero máximo es: "+maximo);
		System.out.println("El número mínimo es: "+minimo);

		/* if(num1!=0)
			 

		 else */

			





		sc.close();
	}

}
