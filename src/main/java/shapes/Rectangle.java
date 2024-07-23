package shapes;

public class Rectangle extends Shape{

    public int length;
    public int width;
    public double result;

    //Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        result = length * width;
        return result;
    }
}
