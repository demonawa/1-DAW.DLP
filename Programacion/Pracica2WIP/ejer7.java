import java.util.Scanner;

public class ejer7 {

	public static void main(String[] args) {

		int num;
		Scanner obLectura = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num = obLectura.nextInt();
		obLectura.close();

		if (num%2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero" + num + "es impar");
		}
		obLectura.close();


	}
}
