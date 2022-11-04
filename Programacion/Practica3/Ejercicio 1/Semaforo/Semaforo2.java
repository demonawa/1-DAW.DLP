package Semaforo;
public class Semaforo2 {
    
    /*
     * Creamos una clase que se llame semaforo que va a tener una propiedad color
     * que va a ser una variable instancia, que puede cambiar a distintos colores.
     */

    /*
     * Creamos la variable de instancia
     */
    
    private String color="Rojo";
   
    /*
     * Creamos los constructores
    */

    
    /*
     * Cambiamos el color del semaforno
    */

    public void setColor(String color){
        this.color=color;
    }

    /*
     * Obtenemos el color del semaforo
     */

     public String getColor(){
        return this.color;
     }

    /*
 * Redefinimos el método toString
 */

public boolean puedoPasar(){
    if(this.color.equals("Verde"))
        return true;

    else return false;
}

public String toString(){

    String cadena=" "; 

    switch (this.color){
        case "Verde" -> cadena ="Verde, puede pasar";
        case "Amarillo" -> cadena ="Amarillo, precaución no pase rápido";
        case "Rojo" -> cadena ="Rojo, no puede pasar";
        default -> cadena ="Semaforno averiado";
    }
return cadena;
}
}
