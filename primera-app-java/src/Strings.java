public class Strings {
    public static void main(String[] args) throws Exception {

        String texto = "Texto asignado a la variable String";

        int longitud =texto.length();

        char primerCaracter = texto.charAt(0);

        char ultimoCaracter = texto.charAt(longitud - 1);

        String subString = texto.substring(0, 5);

        String minuscula = texto.toLowerCase();

        String mayusculas = texto.toUpperCase();

        int indice = texto.indexOf("variable");

        String reemplazado = texto.replace("String", "texto");

        boolean contiene = texto.contains("asignado");

        String sinEspacios = texto.trim();

        System.out.println(longitud);
        System.out.println(primerCaracter);
        System.out.println(ultimoCaracter);
        System.out.println(subString);
        System.out.println(minuscula);
        System.out.println(mayusculas);
        System.out.println(indice);
        System.out.println(reemplazado);
        System.out.println(contiene);
        System.out.println(sinEspacios);
    }
}
