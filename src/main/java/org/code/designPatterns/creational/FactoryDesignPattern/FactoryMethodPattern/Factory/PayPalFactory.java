package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Factory;

import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products.PayPalGateway;
import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products.PaymentGateway;

public class PayPalFactory implements PaymentGatewayFactory{

    @Override
    public PaymentGateway createPaymentGateWay() {
        return new PayPalGateway();
    }
}
