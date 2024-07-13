public class BucleWhile {
    public static void main(String[] args) throws Exception {

        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        do {
            System.out.println("Esto sucede antes de la condicion");
            System.out.println(contador);

            contador++;
        } while (contador <= 5);

        System.out.println(contador);

    }
}
