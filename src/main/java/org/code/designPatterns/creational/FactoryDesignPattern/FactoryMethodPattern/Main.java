package org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern;


import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Factory.PayPalFactory;
import org.code.designPatterns.creational.FactoryDesignPattern.FactoryMethodPattern.Factory.PaymentGatewayFactory;

/*
Factory Method Pattern - Detailed Explanation
The Factory Method Pattern is a creational design pattern that provides an interface for
creating objects in a superclass,
but allows subclasses to alter the type of objects that will be created.

Core Concept
The key idea is that the superclass (usually abstract) defines a factory method
for creating objects,
but lets subclasses decide which concrete class to instantiate.
This is often phrased as "defining an interface for creating an object,
but letting subclasses decide which class to instantiate."

Structure
Product: The common interface for all objects that can be produced by the creator

Concrete Products: Different implementations of the product interface

Creator: The abstract class that declares the factory method

Concrete Creators: Subclasses that implement/override the factory method to produce specific concrete products

---------------------------------------------------------------------
Example:
Payment Gateway Factory - Factory Method Pattern Example
Let's implement a Payment Gateway Factory where different payment providers
(e.g., PayPal, Stripe, Razorpay) are created by their own factories.
 This is useful in e-commerce systems where payment methods can vary.

1. Structure of Payment Gateway Factory
We will have:

PaymentGateway (Interface) → Defines common payment operations.

Concrete Payment Gateways → PayPalGateway, StripeGateway, RazorpayGateway.

PaymentGatewayFactory (Abstract Class) → Declares createGateway().

Concrete Factories → PayPalFactory, StripeFactory, RazorpayFactory.

 */
public class Main {


    public static void main(String[] args) {
        PaymentGatewayFactory factory= new PayPalFactory();
        factory.processOrderPayment(100);
    }


}
