package bank.main;

import bank.model.Employee;
import bank.service.SavingsAccount;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Mini Bank System ===");


        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter DOB: ");
        String dob = sc.nextLine();

        System.out.print("Enter PAN: ");
        String pan = sc.nextLine();

        System.out.print("Enter Aadhaar: ");
        String aadhaar = sc.nextLine();


        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();

        System.out.print("Enter DOJ: ");
        String doj = sc.nextLine();

        System.out.print("Enter CTC: ");
        double ctc = sc.nextDouble();

        // 💰 Account
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Employee emp = new Employee(name, dob, pan, aadhaar, company, doj, ctc);
        SavingsAccount acc = new SavingsAccount(emp, balance);

        int choice;

        do {
            System.out.println("\n1. Display Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acc.displayAccount();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 4:
                    System.out.println("Thank you for using bank ");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}