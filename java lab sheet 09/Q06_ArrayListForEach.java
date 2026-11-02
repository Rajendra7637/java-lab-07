import java.util.ArrayList;

public class Q06_ArrayListForEach {
    public static void main(String[] args) {
        System.out.println("=== Q06: Iterate ArrayList Using For-Each Loop ===");
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Dehradun");
        cities.add("Roorkee");
        cities.add("Delhi");
        cities.add("Haridwar");

        System.out.println("Iterating through cities:");
        for (String city : cities) {
            System.out.println("City: " + city);
        }
    }
}
