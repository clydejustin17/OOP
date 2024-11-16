public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0, "Red", true);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

    
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue", false);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

    
        Square square = new Square(4.0, "Green", true);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}