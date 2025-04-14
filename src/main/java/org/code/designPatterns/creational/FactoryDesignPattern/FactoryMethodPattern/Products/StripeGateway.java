package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products;

public class StripeGateway implements PaymentGateway{
    @Override
    public void makePayment(double amount) {
        System.out.println("Make payment in StripeGateway: "+amount);
    }

    @Override
    public void reversePayment(double amount) {
        System.out.println("Make reverse payment in StripeGateway: "+amount);
    }
}
