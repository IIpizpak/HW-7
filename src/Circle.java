public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double perimeter() {
        return (Math.round(2 * Math.PI * radius));
    }

    @Override
    public double square() {
        return (Math.round(Math.PI * Math.pow(radius, 2)));
    }

}
