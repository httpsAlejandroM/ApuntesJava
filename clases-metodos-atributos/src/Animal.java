public class Animal {

    String nombre;
    int edad;
    // Atributo de clase o metodo de clase para toda la aplicacion.
    static int contadorAnimales = 0;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    public String hacerSonido() {
        return "hacer sonido generico";
    }

    public static int getCantidadAnimales() {
        return contadorAnimales;
    }
}
