import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {

		int num1,num2,num3;

		Scanner obLectura = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		num1 = obLectura.nextInt();

		System.out.println("Introduce un numero: ");
		num2 = obLectura.nextInt();

		System.out.println("Introduce un numero: ");
		num3 = obLectura.nextInt();

		if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("El mayor es: " + num1);                                             
            } else {
                System.out.println("el mayor es: " + num3);     
            }
        } else 
        	if (num2 > num3) {
            System.out.println("el mayor es: " + num2);
        } else {
            System.out.println("el mayor es: " + num3);
        }
		
		
		obLectura.close();

	}

}
