import java.util.Locale;
import java.util.Scanner;
public class Ejer52 {
    public static void main(String[] args) {
        int tiradas,moneda1,moneda2,contCara=0,carasConsecutivas=0,maxCarascons=0,contCruz=0;

        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
        
        System.out.println("Introduce el número de tiradas que quiere realizar: ");
        tiradas=sc.nextInt();
        sc.close();

        for(byte i=0;i<tiradas;i++){
        (moneda1)=(byte)(Math.random()*2);
        (moneda2)=(byte)(Math.random()*2);
        System.out.println(moneda1 + " "+ moneda2);

        if(moneda1==0 && moneda2==0){
            contCara+=2; 
            carasConsecutivas++;
           if(maxCarascons<carasConsecutivas)
           maxCarascons=carasConsecutivas; 
        }
        
        else if(moneda1==1 && moneda2==1){
            contCruz+=2;
            carasConsecutivas=0;
            
        }
        else{
            contCara++;
            contCruz++;
            carasConsecutivas=0;
        }
        
        
    }
    System.out.println("cara "+contCara+" "+"cruz "+contCruz);
    System.out.println("Máximo caras consecutivas: "+maxCarascons);
   
    


    }
}
