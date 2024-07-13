import interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable {

    public Delfin(String nombre){
        super(nombre);
    }

    @Override
    void nadar(){
        System.out.println(nombre + "esta nadando en velocidad con su cola y saltando sobre el agua");
    }

    @Override
    public void comunicarse() {
        System.out.println(nombre + " emite sonidos para comunicarse");
    }
}
