package JavaQAP4.Problem1;

public class Circle extends Ellipse {
    // constructor to initialize the radius of circle
    public Circle(String name, double radius){
        super(name, radius, radius); // both major and minor axis are the same
    }
    // method to compute the perimeter of the circle
    @Override
    double computePerimeter() {
        return 2 * Math.PI * getMajorAxis(); // returns the radius
    }

    // method to compute the area of the circle
    @Override
    double computeArea() {
        double radius = getMajorAxis(); // also returns the radius
        return Math.PI * radius * radius;

    }
    // method to scale the circle
    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
    

}
