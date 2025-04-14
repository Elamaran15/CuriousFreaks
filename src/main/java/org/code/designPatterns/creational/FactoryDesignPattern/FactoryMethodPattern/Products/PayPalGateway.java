package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products;

public class PayPalGateway implements PaymentGateway{
    @Override
    public void makePayment(double amount) {
        System.out.println("Make payment in Paypal: "+amount);
    }

    @Override
    public void reversePayment(double amount) {
        System.out.println("Make a reverse payment in Paypal "+amount);
    }
}
