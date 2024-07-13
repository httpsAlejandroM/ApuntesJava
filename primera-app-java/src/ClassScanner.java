import java.util.Scanner;

public class ClassScanner {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la máquina expendedora de bebidas");
        System.out.println("Elegí una de las siguientes opciones: ");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Vino");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Café, Buena eleccion");
                break;
            case 2:
                System.out.println("Mate, debés ser Argentino");
                break;
            case 3:
                System.out.println("Gaseosa, tené cuidado con el azúcar es mala para la salud");
                break;
            case 4:
                System.out.println("Vino, si tomaste alcohol no manejes");
                break;
            default:
                System.out.println("Opcion no valida, fin del programa");
                break;
        }

        if(opcion <= 4){
            System.out.println("Disfrute de su bebida");
        }
        scanner.close();
    }
}
