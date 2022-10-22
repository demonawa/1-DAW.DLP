import java.util.Scanner;

public class ejer8 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		Scanner obLectura = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1 = obLectura.nextInt();
		
		System.out.println("Introduce un numero");
		num2 = obLectura.nextInt();
		
		if (num1%num2 ==0)
			System.out.println("Se dividen de forma entera");
		else
			System.out.println("No se dividen de forma entera");
		
		obLectura.close();
		
	}

}
