import java.util.Locale;
import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {

		int A;
		int B;
		int C;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce un numero");
		A=sc.nextInt();

		System.out.println("Introduce un numero");
		B=sc.nextInt();

		System.out.println("Introduce un numero");
		C=sc.nextInt();
		
		int cuadradoA = (int) (Math.pow(A,2));
		int cuadradoBC = (int) ((int) ((Math.pow(B,2)) + (Math.pow(C,2))));
		
		if (A>=B+C)
			System.out.println("No es un tri�ngulo");
		else if (cuadradoA == cuadradoBC)
			System.out.println("Tri�ngulo rect�ngulo");
		else if (cuadradoA > cuadradoBC)
			System.out.println("Tri�ngulo obtus�ngulo");
		else if (cuadradoA<cuadradoBC)
			System.out.println("Tri�ngulo acut�ngulo");
		
		sc.close();
	}

}
