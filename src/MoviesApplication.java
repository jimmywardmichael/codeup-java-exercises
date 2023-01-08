//package movies;
//import java.util.Scanner;
//
//
//public class MoviesApplication {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Movie[] movies = MoviesArray.findAll();
//
//        while (true) {
//            System.out.println("What would you like to do?");
//            System.out.println("0 - exit");
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view movies in the animated category");
//            System.out.println("3 - view movies in the drama category");
//            System.out.println("4 - view movies in the horror category");
//            System.out.println("5 - view movies in the scifi category");
//
//            int choice = sc.nextInt();
//            sc.nextLine();
//
//            if (choice == 0) {
//                break;
//            } else if (choice == 1) {
//                for (Movie movie : movies) {
//                    System.out.println(movie.getName() + " -- " + movie.getCategory());
//                }
//            } else if (choice == 2) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("animated")) {
//                        System.out.println(movie.getName());
//                    }
//                }
//            } else if (choice == 3) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("drama")) {
//                        System.out.println(movie.getName());
//                    }
//                }
//            } else if (choice == 4) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("horror")) {
//                        System.out.println(movie.getName());
//                    }
//                }
//            } else if (choice == 5) {
//                for (Movie movie : movies) {
//                    if (movie.getCategory().equals("scifi")) {
//                        System.out.println(movie.getName());
//                    }
//                }
//            } else {
//                System.out.println("Invalid choice");
//            }
//        }