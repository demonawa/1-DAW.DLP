package Libro;

public class Libro{

/*
* Clase libro, la clase libro guardará
infromación de los libros como el: autor, titulo y estado

podemos definir como metodos:
getAutor, setAutor, getTitulo, setTitulo, getEstado,setEstado

@author Daniel López
*/

    //Variables de instancia

    private String autor;

    private String titulo;

    private boolean estado = false;

// Constructores

public Libro(String autor,String titulo, Boolean estado){
    this.autor=autor; this.titulo=titulo; this.estado=estado;
} 
 
    
    //Los setters nos permiten modificar el valor de nuestras instancias
    public void setAutor(String autor)
        {this.autor=autor;}
    

   public void setTitulo(String titulo)
        {this.titulo=titulo;}

    public void setEstado(Boolean estado)
        {this.estado=estado;}

    // Los getters nos permiten saber que valor hay dentro de nuestras instancias.
  public String getAutor()
    {return autor;}

  public String getTitulo()
    {return titulo;}  

 public boolean getEstado()
    {return estado;}



    public boolean estadoLibro(){
        if(estado = false)
            System.out.println("El libro no está disponible");
        else System.out.println("El libro está disponible");

        return estado;
    }

    //Redefinición del método toString
    public String toString(){

        return "Libro [autor="+ autor +",titulo="+ titulo +",estado="+ estado+"]";
}
}
