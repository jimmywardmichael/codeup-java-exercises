import java.util.Arrays;

public class ArrayLec {

    public static void main(String[] args) {
        String[] puppy = {"dog1", "dog2"};
        String[] puppies = {"dog3", "dog4"};
        puppy = new String[4];
        puppies = new String[4];
//        int puppyLength = 4;
        puppy[0] = "Misty";
        puppy[1] = "jimothy";
        puppy[2] = "jimot";
        puppy[3] = "jim";
        puppies[0] = "jack";
        puppies[1] = "jill";
        puppies[2] = "john";
        puppies[3] = "jane";
//        puppy = new String[puppyLength];
        System.out.println(puppy[0]);
        System.out.println(puppy[1]);

        System.out.println(puppy[3]);
        System.out.println(puppy.length);
        for(int i = 0; i < puppy.length; i++){
            System.out.println(puppy[i]);
        }
//        for(String puppy:puppies){
//            System.out.println(puppy);
//        }
        String[] kittens = {"k1", "k2", "k3"};
        System.out.println(Arrays.equals(kittens, puppies));
    }

}
