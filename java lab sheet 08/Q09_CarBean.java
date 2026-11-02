public class Q09_CarBean {
    public static void main(String[] args) {
        System.out.println("=== Q09: CarBean Demo ===");
        CarBean car = new CarBean();
        car.setMake("Toyota");
        car.setModel("Corolla");
        car.setYear(2024);

        System.out.println("Car Make  : " + car.getMake());
        System.out.println("Car Model : " + car.getModel());
        System.out.println("Car Year  : " + car.getYear());
        System.out.println("Car Details: " + car);
    }
}
