//This is a package
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}
// This is a class
package java.experiment6;

public class RunAccount {
    public static void main(String[] args) {
        Account acc = new Account(5000.75);  // ✅ Creating Account object
        acc.displayBalance();
    }
}
