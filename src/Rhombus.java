public class Rhombus extends Shape implements MathOperations {

    private double side;
    private double height;

    public Rhombus(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double perimeter() {
        return side * 2 + height * 2;
    }

    @Override
    public double square() {
        return side * height;
    }

}
