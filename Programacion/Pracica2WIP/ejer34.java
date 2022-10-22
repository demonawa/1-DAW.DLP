import java.util.Locale;
import java.util.Scanner;

public class ejer34 {

	public static void main(String[] args) {
        int n,suma=0;
        int fib0=1;
        int fib1=1;
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Introduzca un número");
        n=sc.nextInt();
        if(n>=2){
            for (int i=2;i<n;i++){
                suma = fib0+fib1;
                fib0=fib1;
                fib1=suma;    
            }
            System.out.println("fib"+"("+n+")"+"="+fib1);
    }
    else System.out.println("fib"+"("+n+")"+"="+1);
    sc.close();
}
}

