import java.util.Locale;
import java.util.Scanner;
public class Ejer36 {
    public static void main(String[] args) {
        int num1,positivo=0,negativo=0,cont=0;
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);  

        System.out.println("Introduce un número: ");
        num1=sc.nextInt();

        while(num1!=0){
            cont++;
            if(num1>0){
                positivo=positivo+1;
            }
               

            if(num1<0){
               negativo=negativo+1;
            }


            
            System.out.println("Introduce un número: ");
            num1=sc.nextInt();
        }
        System.out.println(positivo);
        System.out.println(negativo);
        
        sc.close();
     
    }
       

     
    }

