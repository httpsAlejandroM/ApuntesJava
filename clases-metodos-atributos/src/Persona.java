public class Persona {
    //Atributos (estado/caracteristicas de un objeto)
    private String nombre;
    private String apellido;
    private int edad;
    Carrera carrera;

    //Constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrera, boolean estaCursando){
        carrera = new Carrera(nombreCarrera, duracionCarrera, estaCursando);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera.nombre = nombreCarrera;
    }

    //Sobrecarga del constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera){
        carrera = new Carrera(nombreCarrera);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Metodos (comportamientos de un objeto)
    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }

    public String enviarSaludo(String saludando){
        return "Hola, ¿como estas " + saludando + "?";
    }


    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Getters y Setters

    // public int getEdad(){
    //     return edad;
    // }

    // public void setNombre(String nombre){
    //     this.nombre = nombre;
    // }

    
}
