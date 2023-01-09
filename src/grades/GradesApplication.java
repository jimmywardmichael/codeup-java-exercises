package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();
        students.put("user1", new Student("Student 1"));
        students.put("user2", new Student("Student 2"));
        students.put("user3", new Student("Student 3"));
        students.put("user4", new Student("Student 4"));

        // add some grades for each student
        students.get("user1").addGrade(90);
        students.get("user1").addGrade(80);
        students.get("user1").addGrade(70);

        students.get("user2").addGrade(95);
        students.get("user2").addGrade(85);
        students.get("user2").addGrade(75);

        students.get("user3").addGrade(100);
        students.get("user3").addGrade(90);
        students.get("user3").addGrade(80);

        students.get("user4").addGrade(70);
        students.get("user4").addGrade(80);
        students.get("user4").addGrade(90);

        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("GitHub Usernames: ");
            for (String username : students.keySet()) {
                System.out.print(username + " ");
            }
            System.out.println();

            System.out.print("Enter a GitHub username to see more information (or 'q' to quit): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                keepRunning = false;
            } else if (students.containsKey(input)) {
                Student student = students.get(input);
                System.out.println("Name: " + student.getName());
                System.out.println("Grades: " + student.grades);
                System.out.println("Grade Average: " + student.getGradeAverage());
            } else  {
                System.out.println("No users with that username were found.");
            }
        }
    }
}
