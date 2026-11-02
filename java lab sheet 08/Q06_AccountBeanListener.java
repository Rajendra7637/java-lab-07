public class Q06_AccountBeanListener {
    public static void main(String[] args) {
        System.out.println("=== Q06: PropertyChangeListener on AccountBean ===");
        AccountBean account = new AccountBean("ACC-100234", 5000.0);

        // Add PropertyChangeListener
        account.addPropertyChangeListener(evt -> {
            System.out.println("[Listener Notification] Property '" + evt.getPropertyName() + "' changed!");
            System.out.println("  Previous Balance: " + evt.getOldValue());
            System.out.println("  New Balance     : " + evt.getNewValue());
        });

        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println("Depositing 2500.0...");
        account.setBalance(7500.0);
    }
}
