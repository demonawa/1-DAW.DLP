import java.util.Locale;
import java.util.Scanner;
public class Ejer35 {
    public static void main(String[] args) {
        int a,b,c,factoriala=1,factorialb=1,factorialc=1,divisor=0,total=0;

        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        System.out.println("Introduce un número: ");
        a=sc.nextInt();

        System.out.println("Introduce un número: ");
        b=sc.nextInt();
        
      

        if((a<=b) || (a<0) || (b<=0)){
            System.out.println("Error");}
          else if((a>b)||(a>0)){

            for(int i=1;i<=a;i++){
                factoriala=factoriala*i;
            }
    
        
        for(int i=1;i<=b;i++){
            factorialb=factorialb*i;
        }


    c=a-b;

    for(int i=1;i<=c;i++){
        factorialc=factorialc*i;
    }



    } 
    else{
    divisor=factorialb*factorialc;
    total=factoriala/(divisor);
    System.out.println("El combinatorio de a sobre b es: "+(float)total);
}
    
}
    }

