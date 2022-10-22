import java.util.Locale;
import java.util.Scanner;
public class Ejer38 {
    public static void main(String[] args) {
        char opcion,continuar;
        int num1,factorial=1;

        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

        do{
        System.out.println("Menú de operaciones: "+ "F: Calculará el factorial: "+ 
        "R: Calcula la raíz cuadrada"+ "C: Calcula el cuadrado"+
        "T: Finalizará el algoritmo");
        opcion=sc.nextLine().charAt(0);

        System.out.println("Introduzca un número: ");
        num1=sc.nextInt();

        switch(opcion){
            case 'F':for(int i=1;i<=num1;i++){
                factorial=factorial*i;
            } System.out.println(factorial);
            break;

            case 'R':
            if(num1<0){
                System.out.println("Error");
            }
            System.out.println(Math.sqrt(num1));
            break;

            case'C':System.out.println(Math.pow(num1,2));
            break;
            default: System.out.println("Operacion incorrecta");
        }
        sc.nextLine();
        System.out.println("Quieres continuar?");
        continuar = sc.nextLine().charAt(0); 
    }

    while(Character.toUpperCase(continuar)!='T');       
    sc.close();
    }
}

