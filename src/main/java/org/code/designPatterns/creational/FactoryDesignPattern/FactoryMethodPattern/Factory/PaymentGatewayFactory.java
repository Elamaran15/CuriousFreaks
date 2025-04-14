package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Factory;

import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products.PaymentGateway;

public interface PaymentGatewayFactory {

    // Factory Method (to be implemented by subclasses)
     PaymentGateway createPaymentGateWay();

    // Common payment processing logic
     default void processOrderPayment(double amount) {
        PaymentGateway gateway = createPaymentGateWay();
        gateway.makePayment(amount);
        System.out.println("Payment completed successfully!");
    }
}
