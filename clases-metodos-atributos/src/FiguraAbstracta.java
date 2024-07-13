public abstract class FiguraAbstracta {
    
    //Este comportamiento sera obligatorio en las clases que hereden de figuraAbstracta
    abstract double calcularArea();

    void imprimirInformacion(){
        System.out.println("Esta informacion vviene desde la clase abstracta");
    }


    
}
