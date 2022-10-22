import java.util.Locale;
import java.util.Scanner;
public class Ejer44 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);

    byte nota;

    System.out.println("Introduce un número: ");
    nota=sc.nextByte();

    if((nota>=0)&&(nota<3)){
        System.out.println("Muy deficiente");
    }

    if((nota>=0)&&(nota<5)){
        System.out.println("Insuficiente");
    }

    if((nota>=5)&&(nota<6)){
        System.out.println("Suficiente");
    }

    if((nota>=6)&&(nota<7)){
        System.out.println("Bien");
    }

    if((nota>=7)&&(nota<9)){
        System.out.println("Notable");
    }

    if((nota>=9)&&(nota<=10)){
        System.out.println("Sobresaliente");
    }

    sc.close();
   } 
}
