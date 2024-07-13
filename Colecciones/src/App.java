import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenidos a la fiesta de superheroes");

        List<String> superHeroes = new ArrayList<>();

        superHeroes.add("Spiderman");
        superHeroes.add("Batman");
        superHeroes.add("CatWoman");
        superHeroes.add("Hulk");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Superman");

        superHeroes.add("Iron Man");

        if(superHeroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        System.out.println("Puedo tomar un elemento de la lista con el metodo get: " + superHeroes.get(0));

        superHeroes.set(6, "Tony Stark");
        System.out.println("Iron man se saca el traje, ahora es:  " + superHeroes.get(6));

        superHeroes.remove(3);

        if(!superHeroes.contains("Hulk")){
            System.out.println("Hulk se fue de la fiesta");
        }

       superHeroes.add("Superman");
       superHeroes.add("Superman");
       superHeroes.add("Superman");


       if(superHeroes.isEmpty()){
            System.out.println("La fiesta ha terminado, todos se fueron");
       } else {
        System.out.println("La fiesta continúa aún hay " + superHeroes.size() + " superheroes");
       }

       System.out.println("Quienes estan aún en la fiesta?");
       for (String superHeroe : superHeroes) {
        System.out.println(superHeroe);
       }

    }
}
