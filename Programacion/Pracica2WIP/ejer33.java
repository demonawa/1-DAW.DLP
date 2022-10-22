import java.util.Locale;
import java.util.Scanner;

public class ejer33 {

	public static void main(String[] args) {
		
		int num1,exponente,potencia=1;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduzca un número");
		num1=sc.nextInt();
		
		System.out.println("Introduzca el exponente:");
		exponente=sc.nextInt();
		
		for(int i=0;i<=exponente;i++) {
			potencia = (int) (Math.pow(num1, i));
			
			System.out.println(num1+"^"+i+"="+potencia);
			}

		sc.close();

	}
	

}
