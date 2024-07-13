//Gato hereda de animal
public class Gato extends Animal {
    
    public Gato(String nombre, int edad){
        //super: constructor de la clase que heredamos
        super(nombre, edad);
    }

    @Override
    public String hacerSonido(){
        return "Miau";
    }
}
