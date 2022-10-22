import java.util.Locale;
import java.util.Scanner;

public class ejer22 {

	public static void main(String[] args) {

		float valor,suma=0,contador=0;
		float media=0;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduzca el primer número: ");
		valor = sc.nextFloat();

		while(valor>0) {
			suma = suma + valor;
			contador = contador +1;
			System.out.println("Introzca otro número: ");
			valor = sc.nextFloat();
		}
		
		media = suma / contador;
		System.out.println("La media es : " +media);


		sc.close();
	}

}
