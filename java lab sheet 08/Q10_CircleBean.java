public class Q10_CircleBean {
    public static void main(String[] args) {
        System.out.println("=== Q10: CircleBean Demo ===");
        CircleBean circle = new CircleBean();
        circle.setRadius(7.0);

        System.out.println("Radius        : " + circle.getRadius());
        System.out.printf("Area          : %.2f\n", circle.getArea());
        System.out.printf("Circumference : %.2f\n", circle.getCircumference());
    }
}
