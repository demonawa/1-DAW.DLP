import java.util.Locale;
import java.util.Scanner;
public class Ejer45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);

    byte nota;
    int cont=0,mdeficiente=0,insuficiente=0,suficiente=0,bien=0,notable=0,sobrelsaliente=0;

    System.out.println("Introduce un número: ");
    nota=sc.nextByte();
        
    while(nota!=0){
        cont++;
    if((nota>=0)&&(nota<=3)){
       mdeficiente+=1;
       
    }

    if((nota>=0)&&(nota<5)){
        insuficiente+=1;
    }

    if((nota>=5)&&(nota<6)){
        suficiente+=1;

    }

    if((nota>=6)&&(nota<7)){
        bien+=1;
    
    }

    if((nota>=7)&&(nota<9)){
        notable+=1;
   
    }

    if((nota>=9)&&(nota<=10)){
        sobrelsaliente+=1;

    }
    System.out.println("Introduce un número: ");
    nota=sc.nextByte();

   
    }
    /*Se suma la cantidad de notas sacadas
     * cada suma se multiplica por 100 y se divide entre en total de notas sacadas
    */
    System.out.println(mdeficiente);
    System.out.println(insuficiente);
    System.out.println(suficiente);
    System.out.println(bien);
    System.out.println(notable);
    System.out.println(sobrelsaliente);
    
}
}
