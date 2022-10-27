public class Ejer51 {
    public static void main(String[] args) {
        int prob1;

        for(byte i=1;i<=15;i++){
            (prob1)=(int)(Math.random()*100);

            if(prob1>=0 && prob1<=50)
            System.out.println("Encuentro"+i+": "+1);

            if(prob1>=50 && prob1<=80)
            System.out.println("Encuentro"+i+": "+"x");

            if(prob1>=80 && prob1<=100){
                System.out.println("Encuentro"+i+": "+"2");
            }
         
            }
        }
    }

