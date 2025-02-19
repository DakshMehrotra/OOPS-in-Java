interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account implements Bank {
    private double balance;

    Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(1500);
    }
}
