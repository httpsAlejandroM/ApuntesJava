public class Operadores {
    public static void main(String[] args) throws Exception {

    //Division: 
    double a = 5;
    double b = 4;

    double c = a / b;

    //ASIGNACIÓN: "="
    int numero = 5;
    numero = 10; // 10
    numero += 15; // 25
    numero += 25; // 50
    numero -= 15; // 35
    numero*=2; // 70
    numero/=10; // 7
    numero++; // 8
    numero++;; // 9
    numero--; // 8

    //COMPARACIÓN
    int d = 3;
    int e = 4;
    boolean esMayor = d > e;
    boolean esMenor = d < e;
    boolean esIgual = d == e;

    //OPERADORES
    /*
     * AND: Ambas condiciones deben ser positivas para que de true
     * 
     * OR: Uno de las dos condiciones debe ser positiva para que de true
     * 
     * NOt: Da lo opuesto a lo asignado previamente
     * 
     */

    System.out.println(c);
    System.out.println(numero);
    System.out.println(esMayor);
    System.out.println(esMenor);
    System.out.println(esIgual);
    }
}
