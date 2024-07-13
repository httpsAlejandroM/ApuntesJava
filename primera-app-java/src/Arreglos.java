public class Arreglos {
    public static void main(String[] args) throws Exception {

        //Arreglos: Son estructuras de datos que tienen valores del mismo tipo y bajo el mismo nombre
        //Estos valores de distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un índice
        //Los arreglos son tambien llamados Vectores o Matrices

        int[] numeros = new int[5]; // o int[] numeros = {1, 2, 3, 4 , 5}

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[3] = 4;
        numeros[4] = 5;

        //System.out.println(numeros[0]); //1
        //System.out.println(numeros[1]); //2
        //System.out.println(numeros[2]); //0 (no esta definido)
        //System.out.println(numeros[3]); //4
        //System.out.println(numeros[4]); //5

    }
}
