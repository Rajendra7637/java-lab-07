public class Q07_AccountBeanEventDemo {
    public static void main(String[] args) {
        System.out.println("=== Q07: Updating Balance & Demonstrating Event Firing ===");
        AccountBean account = new AccountBean("ACC-998877", 10000.0);

        account.addPropertyChangeListener(evt -> {
            System.out.println(">> Event Fired: Property [" + evt.getPropertyName() + "] updated from " 
                + evt.getOldValue() + " to " + evt.getNewValue());
        });

        System.out.println("Updating balance step 1: deposit 5000");
        account.setBalance(15000.0);

        System.out.println("Updating balance step 2: withdraw 3000");
        account.setBalance(12000.0);

        System.out.println("Updating balance step 3: interest credit 240");
        account.setBalance(12240.0);
    }
}
