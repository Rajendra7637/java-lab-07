public class Q05_UserBean {
    public static void main(String[] args) {
        System.out.println("=== Q05: UserBean (Write-Only Property) ===");
        UserBean user = new UserBean();
        user.setUsername("rajendra_user");
        user.setPassword("SecretPass@2026");

        System.out.println("Username: " + user.getUsername());
        System.out.println("Verification with correct password: " + user.verifyPassword("SecretPass@2026"));
        System.out.println("Verification with wrong password  : " + user.verifyPassword("WrongPass"));
        System.out.println("Notice: No getPassword() method exists (write-only).");
    }
}
