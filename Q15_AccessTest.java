public class Q15_AccessTest {
    public static void main(String[] args) {
        demo.Q15_AccessMembers obj = new demo.Q15_AccessMembers();
        System.out.println(obj.publicText);
        // Protected/default members are not accessible here because this class is outside package demo.
        // Private members are accessible only inside Q15_AccessMembers.
        System.out.println("Private member via public getter: " + obj.getPrivateText());
    }
}
