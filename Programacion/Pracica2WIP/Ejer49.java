import java.util.Locale;
import java.util.Scanner;

public class Ejer49 {
    public static void main(String[] args) throws InterruptedException {
        /*threads.sleep(1000);*/ /*Sirve para sacar una excepcion */
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        char relojHora;

        byte hora,minutos,segundos;


        System.out.println("Quiere poner el reloj en hora (S/N)?");
            relojHora=sc.nextLine().charAt(0);

        if(relojHora=='S'){
            System.out.println("Hora:");
            hora=sc.nextByte();

            System.out.println("Minutos:");
            minutos=sc.nextByte();

            System.out.println("Segundos:");
            segundos=sc.nextByte();
        
            while(Character.toUpperCase(relojHora)=='S') {
            for(byte incHora=hora;incHora<=23;incHora++){

            for(byte incMinutos=minutos;incMinutos<=59;incMinutos++){
               
                for(byte incSegundos=segundos;incSegundos<=59;incSegundos++){
                System.out.println(incHora+":"+incMinutos+":"+incSegundos);
                 Thread.sleep(1000);
            
            }
                segundos=0;
                minutos++;
            }

                minutos=0;
                hora++;
            }
            hora=0;
        }
            
            sc.close();
    }
}
}
    

    
    
    
    


