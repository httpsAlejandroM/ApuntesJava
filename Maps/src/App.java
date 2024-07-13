import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a nuestra verduleria");

        Map<String, Double> inventario = new HashMap<>();

        // HashMap no respeta el orden
        // TreeMap los ordena alfabeticamente o pasamos el criterio de orden
        // LinkedHashMap mantiene el orden con el que fue creado la lista

        inventario.put("Banana", 0.89);
        inventario.put("Tomate", 0.75);
        inventario.put("Palta", 0.95);
        inventario.put("Frutilla", 0.65);
        inventario.put("Pimiento", 0.77);

        System.out.println("Este es el inventario de frutas y verduras: ");

        // keySet da un arreglo de keys
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));// con el get más la clave puedo acceder al valor
        }

        String frutaBuscada = "Frutilla";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: " + frutaBuscada);

        if (inventario.containsKey(frutaBuscada)) { // verifica que contenga una clave/propiedad
            System.out.println(frutaBuscada + " esta en el inventario ");
        } else {
            System.out.println("Lamentablemente nos quedamos sin " + frutaBuscada);
        }

        String sinStock = "Frutilla";
        inventario.remove(sinStock);// Eliminar una propiedad del map
        System.out.println("Nos quedamos sin: " + sinStock);

        System.out.println("La canitdad de mercaderia es:" + inventario.size()); // nos da la cantidad de pares
                                                                                 // clave-valor que hay
    }
}
