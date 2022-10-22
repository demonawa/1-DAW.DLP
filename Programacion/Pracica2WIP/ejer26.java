import java.util.Locale;
import java.util.Scanner;

public class ejer26 {

	public static void main(String[] args) {

		
		int num1;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce un n�mero: ");
			num1 = sc.nextInt();
			
			for(int i=2;i<num1;i++) {
				System.out.println(i);
			}
			
		sc.close();
	}

}
