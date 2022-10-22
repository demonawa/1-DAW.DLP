import java.util.Scanner;

public class ejer9 {

	public static void main(String[] args) {

		int num,provincia,tOperacion, nOperacion;;


		Scanner obLectura = new Scanner(System.in);
		System.out.println("Introduce un numero de 4 digitos: ");

		num = obLectura.nextInt();

		if (num>9999)

			System.out.println("El número tiene mas de 4 digitos");
		
		else if (num==9999)
				num = obLectura.nextInt();
		provincia = num / 1000;
		System.out.println("La provincia es: " + provincia);
		tOperacion = ((num - (provincia*1000))/100);
		System.out.println("La operacion es: " + tOperacion);

		nOperacion = ((num%100));
		System.out.println("El numero de operacion es: " +nOperacion );
		obLectura.close();

	}

}
