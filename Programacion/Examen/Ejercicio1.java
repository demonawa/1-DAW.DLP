import java.util.Locale;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws InterruptedException  {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
        //Daniel López Páez
        byte hora,minutos,segundos,i=0;

        System.out.println("Hora:");
        hora=sc.nextByte();

        System.out.println("Minutos:");
        minutos=sc.nextByte();

        System.out.println("Segundos:");
        segundos=sc.nextByte();

        
        System.out.println("Hora introducida:"+hora+":"+minutos+":"+segundos);
        

        if(hora>23 || minutos>59 || segundos > 59){
            System.out.println("Formato de hora errónea");}

            else{
        do{
            
        for(byte incHora=hora;incHora<=23;incHora++){
            for(byte incMinutos=minutos;incMinutos<=59;incMinutos++){
                
                for(byte incSegundos=segundos;incSegundos<=59;incSegundos++){
                    i++;
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
        while(i!=5);{
    }
    sc.close();
    }
}
}
