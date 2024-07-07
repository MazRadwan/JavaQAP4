package JavaQAP4.Problem2;
public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double a, double b) {
        super("Ellipse");
        this.majorAxis = Math.max(a, b);
        this.minorAxis = Math.min(a, b);
    }

    @Override
    public double area() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double perimeter() {
        return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis) - Math.pow(majorAxis - minorAxis, 2) / 2);
    }

    @Override
    public void scale(double factor) {
        majorAxis *= factor;
        minorAxis *= factor;
    }
    @Override
    public String toString() {
        return String.format("%s, Major Axis: %.2f, Minor Axis: %.2f", super.toString(), majorAxis, minorAxis);
    }
}


