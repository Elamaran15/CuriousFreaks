package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Factory;

import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products.PaymentGateway;
import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Products.RazorpayGateway;

public class RazorpayFactory implements PaymentGatewayFactory{
    @Override
    public PaymentGateway createPaymentGateWay() {
        return new RazorpayGateway();
    }
}
