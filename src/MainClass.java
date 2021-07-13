import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MainClass {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Triangle triangle = new Triangle(2,2,2);
        Quad quad = new Quad(3.4);
        System.out.println(quad.getSide());


        printer.printType(triangle);
        System.out.println(triangle.perimeter());
    }
}
