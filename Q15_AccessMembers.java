package demo;

public class Q15_AccessMembers {
    public String publicText = "public member";
    protected String protectedText = "protected member";
    String defaultText = "default member";
    private String privateText = "private member";

    public String getPrivateText() {
        return privateText;
    }
}
