import java.util.ArrayList;

public class Q06_ArrayListInheritanceShapeCircle {
    // Parent class Shape
    static abstract class Shape {
        protected String name;

        public Shape(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract double area();

        public void displayArea() {
            System.out.printf("Shape: %-10s | Calculated Area: %.2f\n", name, area());
        }
    }

    // Subclass Circle inheriting from Shape
    static class Circle extends Shape {
        private double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public void displayArea() {
            System.out.printf("Shape: %-10s (Radius: %5.2f) | Calculated Area: %8.2f\n", name, radius, area());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Q06: Inheritance with ArrayList<Shape> ===");

        // Store multiple Circle objects in an ArrayList<Shape>
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle-Small", 3.5));
        shapes.add(new Circle("Circle-Medium", 7.0));
        shapes.add(new Circle("Circle-Large", 14.2));
        shapes.add(new Circle("Circle-XL", 21.0));

        System.out.println("Displaying areas polymorphically via Shape references:");
        for (Shape shape : shapes) {
            shape.displayArea();
        }
    }
}
