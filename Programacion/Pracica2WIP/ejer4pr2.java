import java.util.Scanner;

public class ejer4pr2 {

	public static void main(String[] args) {
		int num;
		Scanner obLectura = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		num = obLectura.nextInt();
		if (num > 0) 
			System.out.println("N�mero positivo");		

		else 
			if (num ==0)
				System.out.println("N�mero es 0");

			else 
				if (num <0) 
					System.out.println("El n�mero es negativo " + num);
		
		obLectura.close();
	}

}
