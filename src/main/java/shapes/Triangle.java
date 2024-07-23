package shapes;

public class Triangle extends Shape{

    public int base;
    public int height;
    public double result;

    //Constructor
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        result = (double) (base * height) / 2;
        return result;
    }
}
