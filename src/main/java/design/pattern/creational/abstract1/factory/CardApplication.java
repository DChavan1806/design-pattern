package design.pattern.creational.abstract1.factory;

/*
  Abstract Factory Pattern can be applied to a scenario where you create Debit Cards and Credit Cards.
 In this example, each type of card (Debit and Credit) could have multiple variants like Visa and Mastercard.
 The goal of the pattern would be to create card objects while ensuring consistency between related objects.
* */
// Interfaces for Cards
interface CreditCard {
    void validateCreditLimit();
}

interface DebitCard {
    void validateBalance();
}

// Abstract Factory
interface CardFactory {
    CreditCard createCreditCard();
    DebitCard createDebitCard();
}

// Concrete Implementations for Visa
class VisaCreditCard implements CreditCard {
    @Override
    public void validateCreditLimit() {
        System.out.println("Validating Visa Credit Card limit...");
    }
}

class VisaDebitCard implements DebitCard {
    @Override
    public void validateBalance() {
        System.out.println("Validating balance for Visa Debit Card...");
    }
}

// Concrete Implementations for Mastercard
class MastercardCreditCard implements CreditCard {
    @Override
    public void validateCreditLimit() {
        System.out.println("Validating Mastercard Credit Card limit...");
    }
}

class MastercardDebitCard implements DebitCard {
    @Override
    public void validateBalance() {
        System.out.println("Validating balance for Mastercard Debit Card...");
    }
}

// Concrete Factory for Visa
class VisaCardFactory implements CardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new VisaCreditCard();
    }

    @Override
    public DebitCard createDebitCard() {
        return new VisaDebitCard();
    }
}

// Concrete Factory for Mastercard
class MastercardFactory implements CardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new MastercardCreditCard();
    }

    @Override
    public DebitCard createDebitCard() {
        return new MastercardDebitCard();
    }
}

public class CardApplication {
    private final CreditCard creditCard;
    private final DebitCard debitCard;

    public CardApplication(CardFactory factory) {
        creditCard = factory.createCreditCard();
        debitCard = factory.createDebitCard();
    }

    public void performOperations() {
        creditCard.validateCreditLimit();
        debitCard.validateBalance();
    }

    public static void main(String[] args) {
        CardFactory visaFactory = new VisaCardFactory();
        CardApplication visaApp = new CardApplication(visaFactory);
        visaApp.performOperations();

        CardFactory mastercardFactory = new MastercardFactory();
        CardApplication mastercardApp = new CardApplication(mastercardFactory);
        mastercardApp.performOperations();
    }
}
