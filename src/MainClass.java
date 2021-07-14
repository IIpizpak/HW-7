public class MainClass {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Shape triangle = new Triangle(2,2,2);
        Shape rhombus = new Rhombus(4, 1);
        Quad quad = new Quad(9);
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(2, 4);

        printer.printType(rhombus);
        printer.printType(triangle);

        System.out.println("Side of quad is " + quad.getSide());
        System.out.println("Triangle perimeter is " + triangle.perimeter());
        System.out.println("Quad perimeter is " + quad.perimeter());
        System.out.println("Quad square is " + quad.square());
        System.out.println(rhombus.perimeter() + quad.perimeter());
        System.out.println("Circle perimeter= " + circle.perimeter() + "\n" + "Circle square=" + circle.square());
        System.out.println("Rectangle perimeter= " + rectangle.perimeter() + "\n" + "Rectangle square=" + rectangle.square());

    }
}
