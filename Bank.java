public class Bank {
    public static void main(String args[]) {
        CurrentAccount account1 = new CurrentAccount("Grossi Mario", 20000.0);
        System.out.println("Account Balance:" + account1.returnBalance());

        try {
            account1.withdraw(1750.5);
            System.out.println("Account balance:" + account1.returnBalance());
        } catch (BancaException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
            e.printStackTrace();
        }

        ContoOnLine account2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        account2.printBalance();

        try {
            account2.withdraw(2000);
            account2.printBalance();
        } catch (BancaException e) {
            System.out.println("Error while picking: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
