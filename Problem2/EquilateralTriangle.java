package JavaQAP4.Problem2;

public class EquilateralTriangle extends Shape {
    private double side;

    public EquilateralTriangle(double side) {
        super("EquilateralTriangle");
        this.side = side;
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double perimeter() {
        return 3 * side;
    }

    @Override
    public void scale(double factor) {
        side *= factor;
    }

    @Override
    public String toString() {
        return String.format("%s, Side: %.2f", super.toString(), side);
    }
}
