public class Rhombus extends Shape implements MathOperations {

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    private double side;
    private double height;

    public Rhombus(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return side * 2 + height * 2;
    }

    @Override
    public double square() {
        return side * height;
    }

    @Override
    public void printType(Shape shape) {

    }
}
