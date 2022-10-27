import java.util.Locale;
import java.util.Scanner;
public class Ejer53 {
    public static void main(String[] args) {
        char letras;

        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        System.out.println("Teclee un carácter: ");
        letras=sc.nextLine().charAt(0);

        while(letras!='.'){
            if(letras!='a'&&letras!='b'&&letras!='c'){
                System.out.println("No se ha encontrado la cadena");
                
            }
        System.out.println("Teclee un carácter: ");
        letras=sc.nextLine().charAt(0);
        }
        System.out.println("Se ha enctronado la cadena");{
           
        }


    }
}
