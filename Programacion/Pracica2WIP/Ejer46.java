import java.util.Locale;
import java.util.Scanner;
public class Ejer46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
        byte moneda;
        char continuar;
        

        do{
            (moneda)=(byte)(Math.random()*2);

            switch(moneda){
                case 0 ->System.out.println("Cara");
                case 1->System.out.println("Cruz");
            }
            System.out.println("Quieres continuar?"+"S/N");
    continuar = sc.nextLine().charAt(0); 
    }
    
    
    while(Character.toUpperCase(continuar)!='N');       
    sc.close();
        
    }
    }

