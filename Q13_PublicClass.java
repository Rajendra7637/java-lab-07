package testpack;

public class Q13_PublicClass {
    public void display() {
        System.out.println("Public class is accessible outside the package.");
    }
}

class Q13_DefaultClass {
    void display() {
        System.out.println("Default class is accessible only inside testpack.");
    }
}
