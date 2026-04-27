package bank.service;

import bank.model.Account;
import bank.model.Employee;

public class SavingsAccount extends Account implements AccountService {

    private Employee employee;

    public SavingsAccount(Employee employee, double balance) {
        super(balance);
        this.employee = employee;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + accountNumber);
        System.out.println("Bank: " + bankName);
        employee.displayEmployee();
        System.out.println("Balance: " + balance);
    }
}