public class Ejer47 {
    public static void main(String[] args) {
        byte dado,contd6=0;

        for(byte i=1;i<=100;i++){
        (dado)=(byte)(Math.random()*6+1);
        if(dado==6)
           contd6+=1;
          

    }
    System.out.println(contd6);
  
    }
}
