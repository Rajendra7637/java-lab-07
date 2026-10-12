import shapes.Q12_Circle;
import shapes.Q12_Rectangle;

public class Q12_ShapesMain {
    public static void main(String[] args) {
        System.out.printf("Circle area: %.2f%n", new Q12_Circle(5).area());
        System.out.println("Rectangle area: " + new Q12_Rectangle(4, 6).area());
    }
}
