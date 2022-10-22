import java.util.Scanner;

public class ejer5 {

	public static void main(String[] args) {

		int puntos;

		Scanner obLectura = new Scanner(System.in);
		System.out.println("Introduce tus puntos");
		puntos = obLectura.nextInt();

		if (puntos >= 90)	
			System.out.println("Grado A");
		else 
			if ((puntos <= 89)||(puntos == 80))
				System.out.println("Grado B");
			else 
				if ((puntos <= 79)||(puntos == 70))
					System.out.println("Grado C");
				else 
					if ((puntos <= 69)||(puntos == 70))
						System.out.println("Grado D");
					else 
						if (puntos >60)
							System.out.println("Grado E");
		obLectura.close();
	}

}
