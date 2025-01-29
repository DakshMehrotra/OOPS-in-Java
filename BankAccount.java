class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount account = new BankAccount(1000);

        // Accessing public method
        account.deposit(500);
        
        // Accessing protected method
        account.withdraw(200);
        account.checkBalance();
    }
}
