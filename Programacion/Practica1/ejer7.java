package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

//7.- Un agricultor que se dedica al cultivo ecológico de naranjas y limones, quiere calcular los beneficios
//que obtiene anualmente por la venta de los mismos. Por este motivo vamos a diseñar una aplicación
//que solicite las ventas (en kilos) de cada semestre para cada fruta. La aplicación mostrará el importe
//total sabiendo que el precio del kilo de naranjas está fijado en 1.25€ y el kilo de limones en 1.90€
public class ejer7 {
	/**
	 * Ejemplo completo de lectura de datos de teclado y escritura
	 * 
	 * @author Daniel López Páez
	 * @version: 1.0
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final float PRECIONARANJA=1.25f;
        final float PRECIOLIMON=1.90f;
       double naranja1,naranja2,limon1,limon2,totalNaranjas,totalLimones,preTlimones,preTnaranjas;
       Scanner sc= new Scanner(System.in);



       System.out.print("Kilo de Naranja vendidas en el primer semestre: ");
       naranja1=sc.nextInt();
       System.out.print("Kilos de naranjas vendidas en el segundo semestre: ");
       naranja2=sc.nextInt();
       
       System.out.print("kilos de limones vendidos en el primer semstere: ");
       limon1=sc.nextInt();
       System.out.print("kilos de limones vendidos el segundo semestre: ");
       limon2=sc.nextInt();
       
       totalNaranjas=naranja1+naranja2;
       
       totalLimones=limon1+limon2;
       
       preTnaranjas=totalNaranjas*PRECIONARANJA;
       
       preTlimones=totalLimones*PRECIOLIMON;

       System.out.print("Gancias total: "+PRECIONARANJA+PRECIOLIMON);
       sc.close();

	
	
	}

}
