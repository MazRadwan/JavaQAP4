package JavaQAP4.Problem1;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

// Constructor to initialize the sides of the triangle
public Triangle(String name, double side1, double side2, double side3) {
    super(name);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;

    if (!isValidTriangle()){
        throw new IllegalArgumentException("The sides do not form a valid triangle");
    }
}
// method to validat the sides of the triangle
private boolean isValidTriangle() {
    return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
}

 // Method to compute the perimeter of the triangle
    @Override
    double  computePerimeter() {
        return side1 + side2 + side3;
    }
// Method to compute the area of the triangle
    @Override
    double computeArea() {
        double s = computePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
// Method to scale the triangle
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
        if (!isValidTriangle()){
            throw new IllegalArgumentException("The sides do not form a valid triangle");
        }
    }


// Getters for the sides of the triangle
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    
}
