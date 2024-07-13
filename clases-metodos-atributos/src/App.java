public class App {
    public static void main(String[] args) throws Exception {

        // Persona persona1 = new Persona("Pedro", "Pascal", 48, "Mandaloriano");
        // Animal animal = new Animal("Bestia", 200);
        // Gato gato = new Gato("Garfield", 10);
        // Carrera carrera1 = new Carrera();

        // persona1.nombre = "Raul";
        // persona1.apellido = "Alvarez";
        // persona1.edad = 53;

        // carrera1.nombre = "Ingenieria en computacion";
        // carrera1.duracion = 6;
        // carrera1.estaEnCurso = false;

        // persona1.carrera = carrera1;

        // System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.getEdad() + " años y esta recibido de "
        //         + persona1.carrera.nombre);
        // // System.out.println(persona1.enviarSaludo("Ragnar Lothbrok"));

        // System.out.println("El animal llamado " + animal.nombre + " hace: " + animal.hacerSonido());
        // System.out.println("El gato llamado " + gato.nombre + " hace: " + gato.hacerSonido());
        // // Atributo de clase o metodo de clase para toda la aplicacion.
        // //No usamos el metodo de una instancia de Animal sino que usamos el metodo static de la clase Animal
        // System.out.println("El total de animales creados es de: " + Animal.getCantidadAnimales());


        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8, 6);

        circulo.imprimirInformacion();
        System.out.println("El área del rectangulo es: " + rectangulo.calcularArea());
    }
}
