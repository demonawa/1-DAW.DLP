package Semaforo;

public class Semaforo{

/*
Clase semaforo
La clase Semáforo, guarda el color en una propiedad (variable de instancia),
llamada colorSemaforo, de tipo String que puede tomar los valores,
verde, rojo, ambar, inicialmente tomará el valor rojo.

como métodos de acceso a la propiedad podríamos definir;
getColor,setColor,

@author Daniel López
*/

/*Variables de instancia */

private String color ="Rojo"; //Iguala el color a Rojo, es el color actual del semáforo.

public void setColor(String color){
    this.color=color;
}


public boolean puedoPasar(){
    if(this.color.equals("Verde"))
        return true;

    else return false;
}

/*
 * Método que comprueba si un vehículo puede pasar en
 * función del color del semáforo
 * 
 * @return --> true, si el semáforo está en verde
 *         --> false, si el semáforo no está en verde.
 */

public String getColor()
    {return this.color;}

/*
 * Redefinimos el método toString
 */
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
