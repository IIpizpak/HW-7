public class Rectangle extends Shape {

    private double height;
    private double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double perimeter() {
        return height * 2 + length * 2;
    }

    @Override
    public double square() {
        return height * length;
    }

}
