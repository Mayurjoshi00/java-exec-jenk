package bank.main;

import bank.model.Employee;
import bank.service.SavingsAccount;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("=== Welcome to Mini Bank System ===");

        // Hardcoded Personal Details
        String name = "Mayur";
        String dob = "01-01-2000";
        String pan = "ABCDE1234F";
        String aadhaar = "123456789012";

        // Hardcoded Employee Details
        String company = "Infosys";
        String doj = "01-06-2022";
        double ctc = 500000;

        // Account Balance
        double balance = 1000;

        // Create objects
        Employee emp = new Employee(name, dob, pan, aadhaar, company, doj, ctc);
        SavingsAccount acc = new SavingsAccount(emp, balance);

        // Display details
        acc.displayAccount();

        // Perform transactions
        acc.deposit(2000);
        acc.withdraw(1000);

        System.out.println("\nAfter transactions:");
        acc.displayAccount();
    }
}