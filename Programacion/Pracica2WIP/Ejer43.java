import java.util.Locale;
import java.util.Scanner;
public class Ejer43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        byte mes;

        System.out.println("Introduce un número: ");
        mes=sc.nextByte();


        switch(mes){
            case 1-> System.out.println("Es Enero");
            case 2->System.out.println("Es Febrero");
            case 3->System.out.println("Es Marzo");
            case 4->System.out.println("Es Abril");
            case 5->System.out.println("Es Mayo");
            case 6->System.out.println("Es Junio");
            case 7->System.out.println("Es Julio");
            case 8->System.out.println("Es Agosto");
            case 9->System.out.println("Es Septiembre");
            case 10->System.out.println("Es Octubre");
            case 11->System.out.println("Es Noviembre");
            case 12->System.out.println("Es Diciembre");

            default-> System.out.println("Mes incorrecto");
        }
        sc.close();
    }
       
    }

