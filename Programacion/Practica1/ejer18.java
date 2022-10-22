package ejer11_21;

import java.util.Scanner;

public class ejer18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double x1,y1,x2,y2,x3,y3,t,area;
		double s1,s2,s3;
		Scanner obLectura = new Scanner(System.in);	
		
		System.out.print("Punto x1:");
		x1 = obLectura.nextInt();
		
		System.out.print("Punto y1:");
		y1 = obLectura.nextInt();
		
		System.out.print("Punto x2:");
		x2 = obLectura.nextInt();
		
		System.out.print("Punto y2:");
		y2 = obLectura.nextInt();
		
		System.out.print("Punto x3:");
		x3 = obLectura.nextInt();
		
		System.out.print("Punto y3:");
		y3 = obLectura.nextInt();
		
		s1=(double) (Math.sqrt((Math.pow(x1-x2,2)) + (Math.pow(y1 - y2,2))));
		s2=(double) (Math.sqrt((Math.pow(x2-x3,2)) + (Math.pow(y2 - y3,2))));
		s3=(double) (Math.sqrt((Math.pow(x3-x1,2)) + (Math.pow(y3 - y1,2))));
		t = (s1+s2+s3)/2;
		area = (double) Math.sqrt(t*(t-s1)*(t-s2)*(t-s3));
		System.out.println("La distancia entre P1 y P2 es de : "+ s1);
		System.out.println("La distancia entre P2 y P3 es de : "+ s2);
		System.out.println("La distancia entre P3 y P1 es de : "+ s3);
		System.out.println("El area del triangula es de :" + area);
		obLectura.close();

	}

}
