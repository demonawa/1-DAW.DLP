import java.util.Locale;
import java.util.Scanner;

public class ejer31 {

	public static void main(String[] args) {

		int num1,cantNum,minimo,maximo;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce la cantidad de n�meros que va a usar: ");
		cantNum=sc.nextInt();
		
		System.out.println("Introduce una serie de n�meros");
		num1=sc.nextInt();
		maximo=num1;
		minimo=num1;


		for(int i=1;i<cantNum;i++) {
			System.out.println("Introduce una serie de n�meros");
			num1=sc.nextInt();
			
			if(maximo<num1)
				maximo=num1;
			
			if(minimo>num1)
				minimo=num1;
			
		}
		System.out.println("El n�mero m�ximo es: "+maximo);
		System.out.println("El n�mero m�nimo es: "+minimo);
		sc.close();
	}


}
