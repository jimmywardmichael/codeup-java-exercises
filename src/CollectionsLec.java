import OOP.Dog;
import java.util.ArrayList;

public class CollectionsLec {

    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog jim = new Dog("Jim", "black");
        Dog wilma = new Dog("Wilma", "black");
        Dog bob = new Dog("Bob", "black");

        dogs.add(jim);
        dogs.add(wilma);
        dogs.add(bob);

        System.out.println(dogs.get(2).getName());
    }
}



