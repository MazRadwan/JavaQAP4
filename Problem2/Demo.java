package JavaQAP4.Problem2;

public class Demo {
    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            System.out.println();
            System.out.println("Before scaling: " + shape);
            shape.scale(factor);
            System.out.println("After scaling: " + shape);
        }
    }

    public static void main(String[] args) {
        Scalable[] shapes = {
            new Circle(5),
            new Ellipse(2, 3),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(6)
        };
        System.out.println();
        System.out.println("Scaling by a factor of 2:");
        scaleAll(shapes, 2);
        System.out.println();
    }
        
}
