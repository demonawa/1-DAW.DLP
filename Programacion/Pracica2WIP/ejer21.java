import java.util.Locale;
import java.util.Scanner;

public class ejer21 {

	public static void main(String[] args) {

		byte multiplicacion;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Introduce un n�mero entero");
		multiplicacion = sc.nextByte();
		
		System.out.println("Tabla del n�mero" + " " + multiplicacion);

		for (int cont=0;cont<=10;cont++) {
			System.out.println(multiplicacion+"*"+cont+"="+multiplicacion*cont);
		}

sc.close();
	}

}
