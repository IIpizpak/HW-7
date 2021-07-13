public class Rectangle extends Shape implements MathOperations{

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    private double height;
    private double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double perimeter() {
        return height * 2 + length * 2;
    }

    @Override
    public double square() {
        return height * length;
    }

    @Override
    public void printType(Shape shape) {

    }
}
