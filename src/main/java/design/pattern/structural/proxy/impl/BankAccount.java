package design.pattern.structural.proxy.impl;

public class BankAccount implements Payment {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " using bank account. Remaining balance: " + balance);
        } else {
            System.out.println("Not enough balance in the bank account.");
        }
    }
}
