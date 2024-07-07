package JavaQAP4.Problem1;

public  class Ellipse extends Shape
{
    private double majorAxis;
    private double minorAxis;

    // constructor to initialize major/minor axis
    public Ellipse(String name, double axis1, double axis2)
    {
        super(name);
    // assign the largest value to majorAxis and the smallest value to minorAxis
    if (axis1 > axis2) {
        this.majorAxis = axis1;
        this.minorAxis = axis2;
    } else {
        this.majorAxis = axis2;
        this.minorAxis = axis1;
    }
}


// method to compute the perimeter of the ellipse
@Override
double computePerimeter() {
    return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis) - Math.pow((majorAxis - minorAxis), 2 ) /2);
}

// method to compute the area of the ellipse
@Override
double computeArea() {
    return Math.PI * majorAxis * minorAxis;
}

// method to scale the ellipse
@Override
public void scale(double factor) {
    majorAxis *= factor;
    minorAxis *= factor;
}

// public getters for the Axes
public double getMajorAxis() {
    return majorAxis;
}

public double getMinorAxis() {
    return minorAxis;
}
}

