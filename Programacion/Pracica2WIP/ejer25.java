import java.util.Locale;
import java.util.Scanner;

public class ejer25 {

	public static void main(String[] args) {
		
		int dividendo1,divisor;
		float contador=0;
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Introduce un dividendo: ");
			dividendo1 = sc.nextInt();
			
			System.out.println("Introduce un divisor: ");
			divisor = sc.nextInt();
			
			
			if(divisor!=0) {
			while (dividendo1>=divisor) {
				contador +=1 ;
				dividendo1 -=divisor;}			
			System.out.println(+contador);
			
			System.out.println(+dividendo1);}
			else
				System.out.println("Error");
				
				
		sc.close();
	}

}
