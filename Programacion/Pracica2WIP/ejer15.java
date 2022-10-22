import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {

		int a,b,c;

		Scanner obLectura = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		a = obLectura.nextInt();

		System.out.println("Introduce un numero: ");
		b = obLectura.nextInt();

		System.out.println("Introduce un numero: ");
		c = obLectura.nextInt();

		if(a>b)
			if(b>c)
			System.out.println(c+" "+b+" "+a);
		
		obLectura.close();





	}

}


