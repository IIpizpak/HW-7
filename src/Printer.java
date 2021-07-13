public class Printer extends Shape{


    @Override
    public void printType(Shape shape) {

        String[] name = shape.getClass().toString().split("class ");
        System.out.println(name[1]);
    }
}
