package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Factory;

import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products.PaymentGateway;
import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products.StripeGateway;

public class StripeFactory implements PaymentGatewayFactory{
    @Override
    public PaymentGateway createPaymentGateWay() {
        return new StripeGateway();
    }
}
