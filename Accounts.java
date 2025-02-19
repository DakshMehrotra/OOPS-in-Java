package experiment6;  // ✅ This must be the first line

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}
package experiment6;  // ✅ Same package name

public class RunAccount {
    public static void main(String[] args) {
        Account acc = new Account(5000.75);  // ✅ Creating Account object
        acc.displayBalance();
    }
}
