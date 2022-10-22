import java.util.Locale;
import java.util.Scanner;

public class ejer27 {

	public static void main(String[] args) {

		int num1,factorial=1,cont=2;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce un número: ");
		num1=sc.nextInt();

		if(num1>=0) {
			while(num1>=cont) {
				factorial = cont * factorial;
				cont++;
			}
			System.out.println(factorial);
		}

		else System.out.println("Error");
		sc.close();

	}

}
