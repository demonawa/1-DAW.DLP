import java.util.Locale;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
        //Daniel López Páez
        char opcion,continuar,chocolate;

        byte bolas;

        double suma=0,coste1=0,coste2=0,coste3=0,costeError=0,costeChoco=0.5,total=0;


        do{
        System.out.println("Tarrina (T) o  Cucurucho(C): ");
        opcion=sc.nextLine().charAt(0);

        System.out.println("Indique el número de bolas: ");
        bolas=sc.nextByte();

        sc.nextLine();

        System.out.println("Desea cono de chocolate(S/N)");
        chocolate=sc.nextLine().charAt(0);
    
        switch(chocolate){
        case 'S'-> suma=costeChoco;
        }
        
        switch(bolas){

        case 1-> {
        coste1=2.5;
        System.out.println("Coste: "+coste1);
    }
        case 2-> {
        coste2=3.5;
        System.out.println("Coste: "+coste2);
    }
        case 3->{
        coste3=4.5;
            System.out.println("Coste:"+coste3);}
        
    
        default-> System.out.println(costeError);
    }

    suma=coste1+coste2+coste3;

        sc.nextLine();
        System.out.println("Desea algo más?(S/N)");
        continuar = sc.nextLine().charAt(0); 
    }
    while(Character.toUpperCase(continuar)!='N');
    
    System.out.println("Total a pagar:"+(double)suma);
    }


}
