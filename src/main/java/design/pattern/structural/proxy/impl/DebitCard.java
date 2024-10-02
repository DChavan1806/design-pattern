package design.pattern.structural.proxy.impl;

public class DebitCard implements Payment {
    private BankAccount bankAccount;

    public DebitCard(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Processing payment through debit card...");
        bankAccount.pay(amount);  // Delegating the payment to the bank account
    }
}
