import java.util.Locale;
import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {

		float operando1,operando2;
		byte opcion;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Introduce el operando:");
		operando1 =sc.nextFloat();

		System.out.println("Introduce el operando:");
		operando2 =sc.nextFloat();
		
		System.out.println("Introduce 1 si quieres multiplicar "+ "Introduce 2 si quieres dividir: " +
		"Introduce 3 si quires sumar: " + "Introduce 4 si quieres restar: " + 
			"Introduce 5 para cerrar la calculadora: ");
		opcion = sc.nextByte();
		
		if (opcion ==1)
		System.out.println(operando1 * operando2);

		if (operando2==0)
			System.out.println("Error");
		else if (opcion==2)
		System.out.println(operando1 / operando2);
			
			else
				if (opcion==3)
		System.out.println(operando1 + operando2);
				else
					if (opcion==4)
		System.out.println(operando1 - operando2);
		
		else 
			if (opcion==5)
				 System.out.println("El programa ha finalizado");
				sc.close();		
	}

}
