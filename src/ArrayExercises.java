
import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

    Person[] people = new Person[3];
    Person person1 = new Person("joe");
    Person person2 = new Person("jill");
    Person person3 = new Person("john");
    people[0]=person1;
    people[1]=person2;
    people[2]=person3;
    for(Person person: people)
    {
        System.out.println(person.getName());
    }
//    public static Person[] addPerson(Person[] oldArr, Person newPerson){
//        Person[] newArr = Arrays.copyOf(oldArr, oldArr.length + 1);
//        newArr[oldArr.length - 1] = newPerson;
//        }
}
}



