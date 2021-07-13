public class Triangle extends Shape implements MathOperations{

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }



    @Override
    public double perimeter() {
        if (side1 == side2 && side1 == side3) return side1 * 3;
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public double square() {
        return Math.sqrt(this.perimeter()*(this.perimeter() - this.side1)*
                (this.perimeter() - this.side2)*(this.perimeter() - this.side3));
    }

    @Override
    public void printType(Shape shape) {

    }
}
