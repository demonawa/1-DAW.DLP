import java.util.Locale;
import java.util.Scanner;
public class Ejer42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        int numPrimo;

        
        System.out.println("Introduce un número: ");
        numPrimo=sc.nextByte();

        if((numPrimo%2==0)||(numPrimo%3==0))
        System.out.println("No es un numero primo");
      else  /*if((numPrimo/numPrimo==1)&&(numPrimo/1==numPrimo))*/
            System.out.println("Es un numero primo");
      
    }
}
