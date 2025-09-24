package bankingsimulation;



public class Account {
    private int accountNo;
    private String name;
    private double balance;

    public Account(int i, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposite: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalance, ArithmeticException {
        if (amount <= 0) {
            throw new ArithmeticException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalance ("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }

    public void showBalance() {
        System.out.println(name + "'s account balance: $" + balance);
    }

    public String getName() {
        return name;
    }

    public int getAccountNo() {
        return accountNo;
    }
}

