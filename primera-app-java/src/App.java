public class App {
    public static void main(String[] args) throws Exception {
/* 
 * VARIABLE:
 * Es un espacio en memoria que tiene un nombre asociado y puede contener un valor cambiante o no
 * 
 * DECLARACIÓN:
 * Asignar el tipo de dato y el nombre de la variabla dándole o no un valor inicial
 * 
 * ASIGNACIÓN:
 * Darle un valor a la variable ya declarada
 */


/*
 * TIPOS DE VARIABLES
 * Variables PRIMITIVAS: Almacenan valores básicos
 * Variables de REFERENCIA: Almacenan direcciones de memoria que apuntan a objetos
 */

 //TIPOS DE DATOS ENTEROS: byte, short, int, long

 int enteros = 5;

 //TIPOS DE DATOS REALES: float(6-7 decimales) y el double(15-16 decimales de precisión)
double decimales = 5.4;

//TIPO DE DATO DE CARACTER

char letra = 's';

//TIPO DE DATO BOOLEANO

boolean v = true;
boolean f = false;

// TIPO DE DATO STRING

String cadena = "Hello world";

//Logs
System.out.println(enteros);
System.out.println(decimales);
System.out.println(letra);
System.out.println(v);
System.out.println(f);
System.out.println(cadena);

}
}
