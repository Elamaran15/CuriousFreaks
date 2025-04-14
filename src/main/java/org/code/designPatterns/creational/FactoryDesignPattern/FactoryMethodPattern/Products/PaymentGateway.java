package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products;
//PaymentGateway (Interface) → Defines common payment operations.


public interface PaymentGateway {
    void makePayment(double amount);
    void reversePayment(double amount);
}
