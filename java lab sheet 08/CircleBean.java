import java.io.Serializable;

public class CircleBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private double radius;

    public CircleBean() {
    }

    public CircleBean(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Read-only calculated property: Area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Read-only calculated property: Circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
