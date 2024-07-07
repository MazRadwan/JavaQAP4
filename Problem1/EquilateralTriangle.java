package JavaQAP4.Problem1;

public class EquilateralTriangle extends Triangle{
    // constructor to intialize the sides of the euilateral triangle
    public EquilateralTriangle(String name, double side){
        super(name, side, side, side); // all sides are the same
    }
    // method to compute the perimeter of the equilateral triangle
    @Override
    double computePerimeter() {
        return getSide1() * 3; 
    }

    // method to compute the area of the equilateral triangle
    @Override
    double computeArea() {
        double side = getSide1();
        return (Math.sqrt(3) / 4) * side * side; // formula for area of equilateral triangle
    }
}
