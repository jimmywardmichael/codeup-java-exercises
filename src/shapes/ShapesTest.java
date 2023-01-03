
package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Test the Rectangle class
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Expected perimeter: 18. Actual perimeter: " + box1.getPerimeter());
        System.out.println("Expected area: 20. Actual area: " + box1.getArea());

        // Test the Square class
        Rectangle box2 = new Square(5);
        System.out.println("Expected perimeter: 20. Actual perimeter: " + box2.getPerimeter());
        System.out.println("Expected area: 25. Actual area: " + box2.getArea());
    }
}
