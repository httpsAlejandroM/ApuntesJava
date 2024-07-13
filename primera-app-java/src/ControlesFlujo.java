public class ControlesFlujo {
    public static void main(String[] args) throws Exception {

        int i;
        for (i = 1; i <= 10; i++){
            System.out.println(i);
            if(i == 5){
                break; //corta el bucle
            }
            if(i == 4){
                continue;//saltea la iteracion actual y pasa a la siguiente iteracion
            }
            System.out.println(i);


        }
    }    
}
