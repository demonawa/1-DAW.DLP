import java.util.Scanner;

public class ejer6 {

	public static void main(String[] args) {
		int num;
		int num2;
		Scanner obLectura = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		num = obLectura.nextInt();
		
		System.out.println("Introduce un numero");
		num2 = obLectura.nextInt();
		
		if (num > num2)
			System.out.println("El número más grande es :" + num);
		else 
			if((num < num2) )
				System.out.println("El numero mayor es " + num2);
		
			else 
				if (num == num2)
					System.out.println("Los numeros son iguales");
		obLectura.close();
	}

}
