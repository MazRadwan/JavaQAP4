package JavaQAP4.Problem1;

abstract class Shape {
    
    //instance variable for the name of the shape
    protected String name;

    //constructor to set name
    public Shape(String name) {
        this.name = name;
    }
    // abstract method to compute the perimeter
    abstract double computePerimeter();

    // abstract method to comput the area
    abstract double computeArea();

    // abstract method to scale the shape
    abstract void scale(double factor);

    //getter for the name
    public String getName() {
        return name;
    }
    //overriding toString to print the shape details
    @Override
    public String toString() {
        return String.format("Shape: %s, Perimeter: %.2f, Area: %.2f", name, computeArea(), computePerimeter());
    }
}

