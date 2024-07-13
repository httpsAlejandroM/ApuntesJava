import Exceptions.CalculadoraException;

public class App {
    public static void main(String[] args) throws Exception {

        // Excepciones: eventos que interrumpen el flujo normal de la aplicación.

        int numero1 = 10;// double numero1 = 5
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        // System.out.println(numero1 / numero2);
        // System.out.println("Esto va despues del error"); //aca no llega porque se
        // interrumple en la linea anterior

        try {
            resultado = calculadora.divirdir(numero1, numero2); // casteo: (int) numero1
            System.out.println(resultado);
        } catch (CalculadoraException e) {
            e.printStackTrace(); // imprime el error/exception
            System.out.println("Esto va despues de la excepcion manejada");
        } finally {
            System.out.println("Hemos finalizado el calculo ya sea exitoso o no");
        }
    }
}
