package movies;
import java.util.Arrays;

public class MoviesApplication {
    // Main method
    public static void main(String[] args) {
        // Array of all movies
        Movie[] movies = MoviesArray.findAll();

        // Print the options for the user
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");

        // Create a new instance
