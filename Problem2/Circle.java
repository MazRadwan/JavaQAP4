package JavaQAP4.Problem2;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        return String.format("%s, Radius: %.2f", super.toString(), radius);
    }
}
