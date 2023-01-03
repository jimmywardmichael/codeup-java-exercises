package shapes;

public class Square extends Rectangle {
    protected double side;
    public Square(double side) {
        super(side, side);
    }
    public double getPerimeter(){
        return 4 * side;
    }
    public  double getArea(){
        return side * 2;
    }
}