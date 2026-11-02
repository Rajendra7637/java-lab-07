public class Q02_RectangleBean {
    public static void main(String[] args) {
        System.out.println("=== Q02: RectangleBean Demo ===");
        RectangleBean rect = new RectangleBean();
        rect.setLength(12.5);
        rect.setWidth(6.0);

        System.out.println("Length    : " + rect.getLength());
        System.out.println("Width     : " + rect.getWidth());
        System.out.println("Area      : " + rect.calculateArea());
        System.out.println("Perimeter : " + rect.calculatePerimeter());
    }
}
