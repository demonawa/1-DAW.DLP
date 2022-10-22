import java.util.Locale;
import java.util.Scanner;

public class ejer30 {

	public static void main(String[] args) {

		int num1,num2,i=0;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce un n�mero: ");
		num1=sc.nextInt();
		i=num1;
		System.out.println("Introduce un n�mero: ");
		num2=sc.nextInt();
		
		if(num1<num2)  {
			while(i%3!=0) 
				i++;
			for(int inc=num1;inc<num1;inc+=6){
				System.out.println(i);
			}
			
		}
		else System.out.println("Error");
		sc.close();
	}

}
