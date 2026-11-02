import java.io.Serializable;

public class UserBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    // Password is a write-only property
    private String passwordHash;

    public UserBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Write-only property: Only setter provided, no getter
    public void setPassword(String password) {
        this.passwordHash = "HASHED_" + Integer.toHexString(password.hashCode());
        System.out.println("[UserBean] Password written and hashed securely.");
    }

    // Business method to verify without exposing password
    public boolean verifyPassword(String inputPassword) {
        String testHash = "HASHED_" + Integer.toHexString(inputPassword.hashCode());
        return testHash.equals(this.passwordHash);
    }
}
