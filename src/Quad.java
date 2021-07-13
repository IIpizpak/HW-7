public class Quad extends Shape implements MathOperations{

    public double getSide() {
        return side;
    }

    private double side;

    public Quad(double side) {
        this.side = side;
    }

    @Override
    public double perimeter() {
        return this.side*4;
    }

    @Override
    public double square() {
        return Math.pow(this.side, 2);
    }

    @Override
    public void printType(Shape shape) {

    }
}
