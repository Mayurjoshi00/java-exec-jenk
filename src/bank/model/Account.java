package bank.model;

public abstract class Account {
    protected static int accountCounter = 1000;
    protected final String bankName = "MyBank";

    protected int accountNumber;
    protected double balance;

    public Account(double balance) {
        this.accountNumber = ++accountCounter;
        this.balance = balance;
    }

    public abstract void displayAccount();
}