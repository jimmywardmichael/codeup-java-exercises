package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        System.out.println("Enter a radius for the cirlce: ");
        double userRadius = Input.getDouble();
        Circle circle = new Circle(userRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
    }
}
