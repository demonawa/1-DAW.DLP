package ejer1_10;
/**
 * Ejemplo completo de lectura de datos de teclado y escritura
 * 
 * @author Daniel López Páez
 * @version: 1.0
 */
public class ejer9c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			byte edadJuan = 20;
			byte edadPedro = 42;
			short sueldoBase = 1980;
			short complementos = 400;
			
			double sueldoJuan = (sueldoBase + complementos + 30);
			double irpfJ = (sueldoJuan*0.15);
			double seguridadJ = (sueldoJuan*0.09);
			double sueldoNetoJ = (sueldoJuan - irpfJ)- (seguridadJ);

			System.out.println("El sueldo de Juan es de:" + sueldoNetoJ);
			
			double sueldoPedro = (sueldoBase + complementos + 100);
			double irpfP = (sueldoPedro*0.15);
			double seguridadP = (sueldoPedro*0.09);
			double sueldoNetoP = (sueldoPedro - irpfP)- (seguridadP);
			
			System.out.println("El sueldo de Juan es de:" + sueldoNetoP);
	}

}
