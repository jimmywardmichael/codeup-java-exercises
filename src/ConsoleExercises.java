import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f", pi);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int userInput = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Please enter 3 words: ");

        String word1 = scanner1.next();
        String word2 = scanner2.next();
        String word3 = scanner3.next();

        System.out.printf("%s %n %s %n %s %n", word1, word2, word3);
        System.out.println("");
        scanner1.nextLine();

        System.out.println("Enter a sentence");
        String userSentence = scanner1.nextLine();
        System.out.printf("your sentence is: %s %n", userSentence);

        System.out.println("Please enter the length of the room");
        String inputLength = scanner1.nextLine();

        System.out.println("Enter the width of the room");
        String widthInput = scanner1.nextLine();

        System.out.printf("length: %s and width: %s %n ", inputLength, widthInput);

        int length = Integer.parseInt(inputLength);
        int width = Integer.parseInt(widthInput);

        int area = width * length;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("Area of the room: %s %n", area);

        System.out.printf("Perimeter of the room: %s %n", perimeter);


    }
}
