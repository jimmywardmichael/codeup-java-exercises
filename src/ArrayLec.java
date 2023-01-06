import java.sql.SQLOutput;

public class ArrayLec {

    public static void main(String[] args) {
        String[] puppy = {"dog1", "dog2"};
        puppy = new String[4];
        int puppyLength = 4;
        puppy[3] = "Misty";
//        puppy = new String[puppyLength];
        System.out.println(puppy[0]);
        System.out.println(puppy[1]);
        puppy[0] = "jimothy";
        System.out.println(puppy[3]);
    }
}
