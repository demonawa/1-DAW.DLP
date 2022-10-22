import java.util.Locale;
import java.util.Scanner;

public class ejer12V3 {

	public static void main(String[] args) {
		int operando1,operando2;
		char opcion,continuar;

		Scanner sc = new Scanner(System.in); //solo se puede abrir 1 vez, pero usarlo muchas.
		sc.useLocale(Locale.US);

		do {
		
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
				try {
					System.out.println("Resultado : "+(operando1/operando2));
				}
				catch(ArithmeticException e) {
					System.out.println("No se puede dividir por 0");

				}
				break;
			default: System.out.println("Operacion incorrecta");
			}
			//Tenemos que limpiar el buffer
			//de teclado ya que falla la lectura del caracter despues de 
			//haber leido un dato numerico
			
			sc.nextLine();
			
			System.out.println("¿Desea realizar otra operación? (S/N): ");
			continuar = sc.nextLine().charAt(0); 
			
		}

		while(Character.toUpperCase(continuar)=='S');

			sc.close();
	}
}
