import java.util.Locale;
import java.util.Scanner;
public class Ejer37 {
    public static void main(String[] args) {
        float valor,suma=0,contador=0;
		float media;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduzca el primer n�mero: ");
		valor = sc.nextFloat();

		while(valor!=0) {
            if(valor<0){
                valor=(valor)*-1;
            }
            suma = suma + valor;
			contador = contador +1;
            System.out.println("Introzca otro n�mero: ");
			valor = sc.nextFloat();
		}
		
		media = suma / contador;
		System.out.println("La media es : " +media);


		sc.close();
        }
    }

