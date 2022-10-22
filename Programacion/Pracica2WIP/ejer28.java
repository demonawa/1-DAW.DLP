import java.util.Locale;
import java.util.Scanner;

public class ejer28 {

	public static void main(String[] args) {

		int num1,num2,cont=0,suma=0,i;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce un número: ");
		num1=sc.nextInt();

		i=num1;
		
		System.out.println("Introduce un número: ");
		num2=sc.nextInt();

		if(num1<num2)  {
			while(i<num2) {
				i++;
				if(i%2==0){		
					cont++;
					suma=suma+i;	
					System.out.println(i);
				}
			};
			System.out.println("Hay "+ cont + " numeros pares");
			System.out.println("La suma de todos los números es: "+suma);
			
		}
		else System.out.println("Error");
		sc.close();
	}

}
