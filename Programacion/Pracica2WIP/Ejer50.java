public class Ejer50 {
    public static void main(String[] args) {
        byte moneda;
        int i=0,contCara=0;

       

        while(contCara!=3){
            (moneda)=(byte)(Math.random()*2);

            if(moneda==0)
            contCara++;


        else{
            contCara=0;
        }
        i++;
        }
        System.out.println(i);
      }
    }

