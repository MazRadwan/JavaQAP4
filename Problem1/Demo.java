package JavaQAP4.Problem1;

public class Demo{
    public static void main(String[] args) {
        // create an array of shape objects
        Shape[] shapes = new Shape[4];

        // instatiate objects from different shape classes
        shapes[0] = new Ellipse("Ellipse", 10, 5);
        shapes[1] = new Circle("Circle", 7);
        shapes[2] = new Triangle("Triangle", 3, 4, 5);
        shapes[3] = new EquilateralTriangle("Equilateral Triangle", 6);

        System.out.println();

       // Loop through the array and print the objects' details
       for (Shape shape : shapes) {
        System.out.println(shape);
    }

    System.out.println();

    // Demonstrate scaling functionality
    for (Shape shape : shapes) {
        shape.scale(1.5);
        System.out.println("Scaled " + shape);
    }
    System.out.println();
    }
}
