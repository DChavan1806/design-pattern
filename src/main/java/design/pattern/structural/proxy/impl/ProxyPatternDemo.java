package design.pattern.structural.proxy.impl;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        // Real subject: Bank account with a balance of 1000
        BankAccount bankAccount = new BankAccount(1000);

        // Proxy: debit card that acts as a proxy to the bank account
        Payment debitCard = new DebitCard(bankAccount);

        // Client using the debit card to make payments
        debitCard.pay(100);  // Using the debit card to pay
        debitCard.pay(300);  // Using the debit card to pay
        debitCard.pay(800);  // This will show insufficient balance
    }
}
