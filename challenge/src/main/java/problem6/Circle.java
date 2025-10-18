package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public double getSurface() {
        return (3.1415 * radius * radius);
    }

    public String toString() {
        return String.format("Circle (radius %.1f cm)", radius);
    }
}
