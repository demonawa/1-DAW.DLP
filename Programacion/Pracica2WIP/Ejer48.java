public class Ejer48 {
    public static void main(String[] args) {
        byte dado1,dado2,contd1=0,contd2=0,contT10=0;

        for(byte i=1;i<=100;i++){
        (dado1)=(byte)(Math.random()*6+1);
        (dado2)=(byte)(Math.random()*6+1);
        if(dado1+dado2==10)
            contT10+=1;
            
    }
    System.out.println(contT10);
    }
}
