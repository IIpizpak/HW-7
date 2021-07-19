public class Quad extends Shape {

    private double side;

    public Quad(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double perimeter() {
        return this.side * 4;
    }

    @Override
    public double square() {
        return Math.pow(this.side, 2);
    }

}
