public class Switch {
    public static void main(String[] args) throws Exception {

        String bebida = "Café";

        switch (bebida) {
            case "Café":
                System.out.println("Buena eleccion");
                break;
            case "Mate":
                System.out.println("Debés ser Argentino");
                break;
            case "Gaseosa":
                System.out.println("Tené cuidado con el azúcar es mala para la salud");
                break;
            case "Vino":
                System.out.println("Si tomaste alcohol no manejes");
                break;
            default:
                System.out.println("Disfruta tu bebida");
                break;
        }
    }
}
