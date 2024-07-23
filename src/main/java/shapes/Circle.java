package shapes;

public class Circle extends Shape {

    public int radius;
    public final double PI = 3.14;
    public double result;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }



    @Override
    public double calculateArea() {
        result = PI * (radius * radius);
        return result;

    }
}
