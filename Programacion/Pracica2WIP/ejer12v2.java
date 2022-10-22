import java.util.Locale;
import java.util.Scanner;

public class ejer12v2 {

	public static void main(String[] args) {
		int operando1,operando2;
		char opcion;

		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);

		System.out.println("Operación: ");
		opcion=sc.nextLine().charAt(0);

		System.out.println("Introduce el operando:");
		operando1 =sc.nextInt();

		System.out.println("Introduce el operando:");
		operando2 =sc.nextInt();

		switch(opcion) {	

		case '+':System.out.println("Resultado : "+ (operando1+operando2)); break;
		case '-':System.out.println("Resultado : "+ (operando1-operando2)); break;
		case '*':System.out.println("Resultado : "+ (operando1*operando2)); break;
		case '/':
		if(operando2!=0)
			System.out.println("Resultado : "+(operando1/operando2));
		else
			System.out.println("No se puede dividir por 0");
		default: System.out.println("Operación incorrecta");
		}

		sc.close();
	}
}
