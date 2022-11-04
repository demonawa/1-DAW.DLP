import Semaforo.Semaforo2;

public class TestSemaforo2 {
    public static void main(String[] args) {
        Semaforo2 semaforo1 = new Semaforo2();
        Semaforo2 semaforo2 = new Semaforo2();

        semaforo1.setColor("Verde");
        System.out.println(semaforo1.getColor());

        semaforo2.setColor("Rojo");
        System.out.println(semaforo2.getColor());


        if(semaforo1.getColor().equals("Rojo")){
            System.out.println("No puedes pasar");}

        if(semaforo1.puedoPasar()==true){
            System.out.println("Puedes pasar");}
       
        else {System.out.println("No puedes pasar");}

        System.out.println("\n"+semaforo1.toString());
        System.out.println("\n"+semaforo2.toString());
        
    }
}
