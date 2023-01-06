
import java.util.Arrays;
public class ArrayExercises {
public static void main(String[] args){
    int[] numbers = {1,2,3,4,5};
    System.out.println(numbers);
}
    Person[] people = new Person[3];{
        people[0] = new Person("Alice");
        people[1] = new Person("Bob");
        people[2] = new Person("Charlie");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
            }
        }
        public static Person[] addPerson(Person[] people, Person person) {
            Person[] newPeople = Arrays.copyOf(people, people.length + 1);
            newPeople[newPeople.length - 1] = person;
            return newPeople;
        }
    }
}
