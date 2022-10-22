import java.util.Locale;
import java.util.Scanner;

public class ejer23 {

	public static void main(String[] args) {

	int num1,num2,suma=0;
	
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.US);
	
	System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		num2 = sc.nextInt();
		
		for (int cont=num1;cont<=num2;cont++) {
			suma = suma + cont;
		}
			
		System.out.println("El resultado de la suma es " +suma);
		sc.close();
		
	}

}
