import java.util.Scanner;
import java.util.Locale;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
        //Daniel López Páez
        byte edad,mayoresEdad=0,menoresEdad=0,masJoven,masMayor;
        float suma=0,i=0,media=0;

        System.out.println("Introduzca su edad");
        edad=sc.nextByte();

        masJoven=edad;
        masMayor=edad;

        while(edad>0){
            suma=suma+edad;
            i++;
            if(edad>=18){
                mayoresEdad+=1;

             
            }
            else {
                menoresEdad+=1;
            } 

            if(masMayor<edad)
            masMayor=edad;   
        if(masJoven>edad)
            masJoven=edad;

        System.out.println("Introduzca su edad");
        edad=sc.nextByte();
        }
        sc.close();
        media=suma/i;

        System.out.println("Alumnos mayores de edad: "+mayoresEdad);
        System.out.println("Alumnos menores de edad: "+menoresEdad);
        System.out.println("Edad alumno más joven:" +masJoven);
        System.out.println("Edad alumno más mayor:"+masMayor);
        System.out.println("Edad media: "+media);

    }

}
