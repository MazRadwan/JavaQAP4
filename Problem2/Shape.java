package JavaQAP4.Problem2;

// since shape is an abstract class it does not need to implement the Scalable interface directly

public abstract class Shape implements Scalable {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return String.format("Shape: %s, Area: %.2f, Perimeter: %.2f", name, area(), perimeter());
    }
}

