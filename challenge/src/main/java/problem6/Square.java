package problem6;

public class Square extends Forme {
    private double side_length;

    public Square(double s) {
        this.side_length = s;
    }

    public double getSurface() {
        return side_length * side_length;
    }

    public String toString() {
        return String.format("Square (side %.1f cm)", side_length);
    }
}
