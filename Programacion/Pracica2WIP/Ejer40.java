import java.util.Locale;
import java.util.Scanner;
public class Ejer40 {
    public static void main(String[] args) {
        float dinero;
       
        double moneda2=2.00,moneda1=1.00,moneda50=0.50,moneda20=0.20,
        moneda10=0.10,moneda5=0.05,moneda2cent=0.02,moneda1cent=0.01;

        double cantidad500=0,cantidad200=0,cantidad100=0,cantidad50=0,cantidad20=0,cantidad10=0,
        cantidad5=0,cantidadM2=0,cantidadM1=0,cantidadM50=0,cantidadM20=0,cantidadM10=0,cantidadM5=0,cantidadM002=0,cantidadM001=0;
        

        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        System.out.println("Introduce una cantidad de dinero: ");
        dinero=sc.nextFloat();

       double cantidadCent1=(dinero);
        System.out.println(cantidadCent1);

       

       cantidad500=(int)((cantidadCent1-cantidadCent1%500)/500);
       cantidadCent1=cantidadCent1%500;
        System.out.println((int)cantidad500+" billetes de 500" );

        cantidad200=(int)((cantidadCent1-cantidadCent1%200)/200);
        cantidadCent1=cantidadCent1%200;
         System.out.println((int)cantidad200+" billetes de 200" );

         cantidad100=(int)((cantidadCent1-cantidadCent1%100)/100);
         cantidadCent1=cantidadCent1%100;
          System.out.println((int)cantidad100+" billetes de 100" );

        cantidad100=(int)((cantidadCent1-cantidadCent1%100)/100);
        cantidadCent1=cantidadCent1%100;
        System.out.println((int)cantidad100+" billetes de 100" );
        
        cantidad50=(int)((cantidadCent1-cantidadCent1%50)/50);
        cantidadCent1=cantidadCent1%50;
         System.out.println((int)cantidad50+" billetes de 50" );
 
         cantidad20=(int)((cantidadCent1-cantidadCent1%20)/20);
         cantidadCent1=cantidadCent1%20;
          System.out.println((int)cantidad20+" billetes de 20" );
 
          cantidad10=(int)((cantidadCent1-cantidadCent1%10)/10);
          cantidadCent1=cantidadCent1%10;
           System.out.println((int)cantidad10+" billetes de 10" );
 
         cantidad5=(int)((cantidadCent1-cantidadCent1%5)/5);
         cantidadCent1=cantidadCent1%5;
         System.out.println((int)cantidad5+" billetes de 5" );



        System.out.println("Cantidad Monedas");

        cantidadM2=((cantidadCent1-cantidadCent1%moneda2)/moneda2);
        cantidadCent1=cantidadCent1%moneda2;
         System.out.println(cantidadM2+" monedas de 2" );

         cantidadM1=((cantidadCent1-cantidadCent1%moneda1)/moneda1);
        cantidadCent1=cantidadCent1%moneda1;
         System.out.println(cantidadM1+" monedas de 1" );
 
         cantidadM50=((cantidadCent1-cantidadCent1%moneda50)/moneda50);
         cantidadCent1=cantidadCent1%moneda50;
          System.out.println(cantidadM50+" monedas de 50Cent" ); 
        
          cantidadM20=((cantidadCent1-cantidadCent1%moneda20)/moneda20);
         cantidadCent1=cantidadCent1%moneda20;
          System.out.println(cantidadM20+" monedas de 20Cent" ); 
        
          cantidadM10=((cantidadCent1-cantidadCent1%moneda10)/moneda10);
          cantidadCent1=cantidadCent1%moneda10;
           System.out.println(cantidadM10+" monedas de 10Cent" ); 

           cantidadM5=((cantidadCent1-cantidadCent1%moneda5)/moneda5);
         cantidadCent1=cantidadCent1%moneda5;
          System.out.println(cantidadM5+" monedas de 5Cent" ); 

          cantidadM002=((cantidadCent1-cantidadCent1%moneda2cent)/moneda2cent);
          cantidadCent1=cantidadCent1%moneda2cent;
           System.out.println(cantidadM002+" monedas de 2Cent" ); 

           cantidadM001=((cantidadCent1-cantidadCent1%moneda1cent)/moneda1cent);
         cantidadCent1=cantidadCent1%moneda1;
          System.out.println(cantidadM001+" monedas de 1Cent" ); 
           

        sc.close();
    }
}
