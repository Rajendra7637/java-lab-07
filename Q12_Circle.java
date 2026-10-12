package shapes;

public class Q12_Circle {
    private final double radius;

    public Q12_Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
