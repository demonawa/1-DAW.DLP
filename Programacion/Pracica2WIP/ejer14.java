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
			System.out.println("No es un triángulo");
		else if (cuadradoA == cuadradoBC)
			System.out.println("Triángulo rectángulo");
		else if (cuadradoA > cuadradoBC)
			System.out.println("Triángulo obtusángulo");
		else if (cuadradoA<cuadradoBC)
			System.out.println("Triángulo acutángulo");
		
		sc.close();
	}

}
