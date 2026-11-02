public class Q04_DateBean {
    public static void main(String[] args) {
        System.out.println("=== Q04: DateBean (Read-Only Property) ===");
        DateBean dateBean = new DateBean();
        System.out.println("Read-only Current Date: " + dateBean.getCurrentDate());
        System.out.println("Notice: No setter exists for currentDate property.");
    }
}
