public class Circle extends Shape implements MathOperations{

    public double getRadius() {
        return radius;
    }

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (2*Math.PI*radius);
    }

    @Override
    public double square() {
        return (Math.PI*Math.pow(radius, 2));
    }

    @Override
    public void printType(Shape shape) {

    }
}
