package com.company;

public class BankAccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(635463, 1200, "Greg", "greg@gmail.com", 0123203232);

        acc1.deposit(600);
        acc1.withdraw(1000);
    }


}
