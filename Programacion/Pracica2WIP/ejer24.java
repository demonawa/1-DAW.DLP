import java.util.Locale;
import java.util.Scanner;

public class ejer24 {

	public static void main(String[] args) {
		
		int num1,num2;
		/*int contadorW=0;*/
		float suma=0;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Introduce un número: ");
			num1 = sc.nextInt();
			
			System.out.println("Introduce otro número: ");
			num2 = sc.nextInt();

			System.out.println("Bucle for");
			for (int contador=0;contador <num1;contador++) {
				suma +=num2;
			}
			System.out.println("El resultado de la multiplicacion es: " +suma);		
				
			
			/*System.out.println("Bucle while: ");
			
			
			
			while (contadorW<num1) {
			contadorW++;
			suma +=num2;}
			
			System.out.println("El resultado de la multiplicacion es: " +suma);*/
				sc.close();
	}

}
