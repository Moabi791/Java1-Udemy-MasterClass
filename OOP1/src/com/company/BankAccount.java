package com.company;

public class BankAccount {

    private int accNumber;
    private double balance;
    private String name;
    private String email;
    private double contact;

    public BankAccount() {
        System.out.println("No constructor called");
    }

    public BankAccount(int accNumber, double balance, String name, String email, double contact) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.contact = contact;
    }

    public void deposit(double deposit) {
        balance += deposit;
        System.out.println("Your new balance is: " + balance);
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;

        if (balance < 0) System.out.println("You have insufficient funds");
        else System.out.println("Your new balance is: " + balance);
    }
}
