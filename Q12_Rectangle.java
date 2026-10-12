package shapes;

public class Q12_Rectangle {
    private final double length, width;

    public Q12_Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}
