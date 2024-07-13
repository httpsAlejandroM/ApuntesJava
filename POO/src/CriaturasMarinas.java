public abstract class CriaturasMarinas {

    String nombre;

    CriaturasMarinas(String nombre){
        this.nombre = nombre;
    }

    //Esto obliga a sobreescribir en las clases que hereden de criaturas marinas

    abstract void nadar();
}
