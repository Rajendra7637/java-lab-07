import testpack.Q13_PublicClass;

public class Q13_DefaultAccessMain {
    public static void main(String[] args) {
        new Q13_PublicClass().display();
        // Q13_DefaultClass cannot be accessed here because it is package-private.
    }
}
