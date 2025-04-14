package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products;

public class RazorpayGateway implements PaymentGateway{
    @Override
    public void makePayment(double amount) {
        System.out.println("Make payment in RazorpayGateway: "+amount);
    }

    @Override
    public void reversePayment(double amount) {
        System.out.println("Make Reverse payment in RazorpayGateway: "+amount);
    }
}
