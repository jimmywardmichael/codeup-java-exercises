import java.util.Scanner;
//import java.util.String;
public class Main {
    public static void main(String[] args) {
//        int myFavoriteNumber = 2;
//        String myString = "Good Morning, Icon!";
//        System.out.println(myString);

//        myString = 'c';
//        myString = 3.14159;
//        long myNumber = 3.14;
//        System.out.println(myNumber);

//        long myNumber = 123L;
        // long cannot use decimal points

//        long myNumber = 123;
//        System.out.println(myNumber);

//        float myNumber = 3.14;
//        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//        int class /////////

//        String theNumberThree = "three";
//        Object o = theNumberThree;
////        int three = (int) o;
//        int three = (int) "three";

//        int x = 4;
//        x = x + 5;

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        x /= y shorthand of line 44
//        y = y - x;
//        y -= x shorthand of line 46

//        int reallyBigNumber = 2147483647;
//        int reallyBigNumber2.MAX_VALUE = 2147483648;
//line 50 goes past int buffer

///////////////////////////////End syntax lecture
//%s string %d decimal intergers
/// ///////// ///////////////////////////////////////// Starts Console Input Output Lecture
//%s inserts value of a string s is for string for example line 58 %n is for new line function
//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);
//
//
//        String greeting = "Salutations";
//        String name1 = "codeup";
//        System.out.printf("%s, %s!", greeting, name1);

//     ***************************   .next reads only first word and .nextLine reads entire line******************
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");




    }
}

//main method shortcut
//main(tab/enter)
//psvm(tab/enter)
//System.out.println shortcut
//sout <<<<<<  is shortcut