import java.io.Serializable;

public class CarBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String make;
    private String model;
    private int year;

    public CarBean() {
    }

    public CarBean(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarBean [make=" + make + ", model=" + model + ", year=" + year + "]";
    }
}
