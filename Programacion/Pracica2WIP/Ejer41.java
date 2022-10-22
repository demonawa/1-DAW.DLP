import java.util.Locale;
import java.util.Scanner;
public class Ejer41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        byte num1,num2;

        System.out.println("Introduce un número: ");
        num1=sc.nextByte();

        System.out.println("Introduce un número: ");
        num2=sc.nextByte();

        if((num1>50) || (num1<0) || (num2>50) || (num2<0))
            System.out.println("Error");
        
        for(byte i=num1;i>num2;i-=2)
            System.out.println(i);

        for(byte i=num2;i>num1;i-=2)
        System.out.println(i);

        for(byte i=num1;i<num2;i+=5)
        System.out.println(i);

        for(byte i=num2;i<num1;i+=5)
        System.out.println(i);
          sc.close();  
    }
}
