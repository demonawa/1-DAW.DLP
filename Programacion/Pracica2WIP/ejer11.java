import java.util.Locale;
import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {

		float numeroDecimal;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduce un numero decimal");
		numeroDecimal =sc.nextFloat();

		if ((numeroDecimal>-0.99) && (numeroDecimal < 0.99)) {
			System.out.println("El numero"+ numeroDecimal + "es casi 0");
		}
		else {
			System.out.println("El numero"+ numeroDecimal + "no es casi 0");
		}



		sc.close();

	}
	}




