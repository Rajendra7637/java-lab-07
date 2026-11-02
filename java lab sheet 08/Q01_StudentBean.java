public class Q01_StudentBean {
    public static void main(String[] args) {
        System.out.println("=== Q01: StudentBean Demo ===");
        StudentBean student = new StudentBean();
        student.setId(101);
        student.setName("Rajendra Singh");
        student.setGrade(88.5);

        System.out.println("ID    : " + student.getId());
        System.out.println("Name  : " + student.getName());
        System.out.println("Grade : " + student.getGrade());
        System.out.println("Full Bean: " + student);
    }
}
